grammar Calcul;

@parser::members {
    Utils utils = new Utils();
}


// Parser

start: calcul EOF;

calcul returns[ String code ]
	@init { $code = new String(); } // On initialise une variable pour accumuler le code 
	@after { System.out.println($code); }:

        (decl { $code += $decl.code; })*
       
        { $code += "JUMP Start\n"; }
        
        NEWLINE*

        (fonction { $code += $fonction.code; })*
        
        NEWLINE*
        
        { $code += "LABEL Start\n"; }
        
        (bloc { $code += $bloc.code; })*

        (instruction { $code += $instruction.code; })*

        { 
            $code += "HALT\n"; 
        };

decl returns[ String code ]:
	TYPE IDENTIFIANT finInstruction {
        utils.addVarDecl($IDENTIFIANT.text, $TYPE.text);
        if(utils.isDouble($TYPE.text)){
            $code = "PUSHF 0.0\n";
        }else{
            $code = "PUSHI 0\n";
        }
       
    }
	| TYPE IDENTIFIANT '=' expression finInstruction {

        utils.addVarDecl($IDENTIFIANT.text, $TYPE.text);
        VariableInfo vi = utils.getVar($IDENTIFIANT.text);

        if(utils.isDouble(vi.type)){
            $code = "PUSHF 0.0\n";
        }else{
            $code = "PUSHI 0\n";
        }
        $code += $expression.code;

        if(($TYPE.text.equals("int") || $TYPE.text.equals("bool")) && $expression.type.equals("double")){
            $code += "FTOI\n";
            System.err.println("Warning : les types ne matchent pas -> conversion implicite vers int");
        }
        else if($TYPE.text.equals("double") && ($expression.type.equals("int") || $expression.type.equals("bool"))){
            $code += "ITOF\n";
            System.err.println("Warning : les types ne matchent pas -> conversion implicite vers double");
        }

        if(utils.isDouble(vi.type)){
            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
            $code += utils.getInstructionFromAddress(vi2, "STORE");
        } // Enregistrement de la partie décimale

        $code += utils.getInstructionFromAddress(vi, "STORE"); // Enregistrement de la partie entière
    }

    | TYPE IDENTIFIANT '=' condition finInstruction {

        utils.addVarDecl($IDENTIFIANT.text, $TYPE.text);
        VariableInfo vi = utils.getVar($IDENTIFIANT.text);

        if(utils.isDouble(vi.type)){
            $code = "PUSHF 0.0\n";
        }else{
            $code = "PUSHI 0\n";
        }
        $code += $condition.code;

        if($TYPE.text.equals("double")){
            $code += "ITOF\n";
        }

        if(utils.isDouble(vi.type)){
            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
            $code += utils.getInstructionFromAddress(vi2, "STORE");
        } // Enregistrement de la partie décimale

        $code += utils.getInstructionFromAddress(vi, "STORE"); // Enregistrement de la partie entière
    }
    ;

assignation returns[ String code ]:
    IDENTIFIANT '=' e = expression {  
        VariableInfo vi = utils.getVar($IDENTIFIANT.text);
        $code = $e.code;

        if(vi.type.equals("double") && ($e.type.equals("int") || $e.type.equals("bool"))){
            $code += "ITOF\n";
            System.err.println("Warning : les types ne matchent pas -> conversion implicite vers double");
        }
        else if((vi.type.equals("int") || vi.type.equals("bool")) && $e.type.equals("double")){
            $code += "FTOI\n";
            System.err.println("Warning : les types ne matchent pas -> conversion implicite vers int");
        }
                

        if(utils.isDouble(vi.type)){
            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
            $code += utils.getInstructionFromAddress(vi2, "STORE");
        }

        $code += utils.getInstructionFromAddress(vi, "STORE");
    }

    | IDENTIFIANT '=' c = condition {
        VariableInfo vi = utils.getVar($IDENTIFIANT.text);

        $code = $c.code;
        if(utils.isDouble(vi.type)){
            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
            $code += utils.getInstructionFromAddress(vi2, "STORE");
        }

        $code += utils.getInstructionFromAddress(vi, "STORE");
    }
	
	| IDENTIFIANT op=('+='|'-='|'*='|'/='|'%=') e = expression {
        
        VariableInfo vi = utils.getVar($IDENTIFIANT.text);
        $code = utils.getInstructionFromAddress(vi, "PUSH");

        String type = vi.type;
        
        if(utils.isDouble(vi.type)){
            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
            $code += utils.getInstructionFromAddress(vi2, "PUSH");
        }
        $code += $e.code;

        if(vi.type.equals("double") && ($e.type.equals("int") || $e.type.equals("bool"))){
            $code += "ITOF  \n";
            type = "double";
            System.err.println("Warning : les types ne matchent pas -> conversion implicite vers double");
        }
        else if((vi.type.equals("int") || vi.type.equals("bool")) && $e.type.equals("double")){
            $code += "FTOI\n";
            type = "int";
            System.err.println("Warning : les types ne matchent pas -> conversion implicite vers int");
        }

        
        String operation = "";
        switch($op.text){
            case "+=":
                operation = "ADD\n";
                break;

            case "-=":
                operation = "SUB\n";
                break;

            case "*=":
                operation = "MUL\n";
                break;


            case "/=":
                operation = "DIV\n";
                break;


            case "%=":
                operation = "MOD\n";
                break;

            default:
                break;

        }

        if(type.equals("double")) operation = "F" + operation;

        $code += operation;


        if(utils.isDouble(vi.type)){
            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
            $code += utils.getInstructionFromAddress(vi2, "STORE");
        }

        $code += utils.getInstructionFromAddress(vi, "STORE");
    };

instruction returns[ String code ] :

	expression finInstruction { 
            $code = $expression.code;
    }
	| assignation finInstruction { 
		    $code = $assignation.code;
    }
    | bloc { $code = $bloc.code; }

	| 'input' '(' IDENTIFIANT ')' finInstruction {
        VariableInfo vi = utils.getVar($IDENTIFIANT.text);

        if(utils.isDouble(vi.type)){
            $code = "READF\n";
            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
            $code += utils.getInstructionFromAddress(vi2, "STORE");
        }else{
            $code = "READ\n";
        }

        $code += utils.getInstructionFromAddress(vi, "STORE");
        
    }
	| 'output' '(' expression ')' finInstruction {
        $code = $expression.code;   
        if(utils.isDouble($expression.type)){
            $code += "WRITEF\n"
                  +"POP\n"
                  +"POP\n";
        }else{
            $code += "WRITE\n"
                  +"POP\n";
        }
    }
    
    | RETURN expression finInstruction {
        VariableInfo vi = utils.getReturn();
        $code = $expression.code;

        if(utils.isDouble(vi.type)){
			$code += "STOREL " + (vi.address + 1) +"\n";
		}

        $code += "STOREL " + (vi.address) +"\n";

        $code += "RETURN \n";
    }
    | boucle {$code = $boucle.code;}

    | 'break' finInstruction {  // Ajout du break
        $code = utils.generateBreak();
    }

    | 'continue' finInstruction {
        $code = utils.generateContinue();
    }

    | ifCondition {
        $code = $ifCondition.code;
    }
   
	| finInstruction {
        $code = "";
    };
finInstruction: ( NEWLINE | ';')+;

bloc returns [ String code ]  @init{ $code = new String(); } 
    : NEWLINE*
    '{' 
        NEWLINE*

        (decl { $code += $decl.code; })*

        NEWLINE*
        
        (
            // On affiche le code effectivement produit
            instruction { $code += $instruction.code; }
        )*
        NEWLINE*

    '}'
     NEWLINE* ;

condition returns [String code]:

    '(' condition ')' {$code = $condition.code;}
    
    | e = expression op=('=='|'!='|'<>'|'>'|'>='|'<'|'<=') f=expression{
        $code=utils.evalexpr($e.code, $op.text, $f.code, $e.type, $f.type);
    }

    | 'not' a = condition{
        $code= $a.code 
                + "PUSHI 0\n"
                + "EQUAL\n";
    }
    | a = condition  'and'  b = condition{
        $code= $a.code + $b.code
                + "MUL\n";
    }
    | a = condition  'or'  b = condition{
        $code= $a.code + $b.code
                + "ADD\n"
                + "PUSHI 0\n"
                + "NEQ\n";
    }

    | e  = expression{
        $code = $e.code;
        
        if(utils.isDouble($e.type)){

            $code += "PUSHF 0.0\n" + "FNEQ\n";

        }
        else{
            $code += "PUSHI 0\n" + "NEQ\n";
        }
    }

    | TRUE  { $code = "PUSHI 1\n"; }
    | FALSE { $code = "PUSHI 0\n"; }

    ;
    
ifCondition returns [String code]
    @init{
        $code = new String();
        String elseLabel = utils.newLabel();
        String endLabel = utils.newLabel();
    }
    @after { $code += "LABEL " + endLabel + "\n"; }:

    'if' '(' condition ')' 'then' instruction {

        $code = $condition.code
                + "JUMPF "+elseLabel + "\n"
                + $instruction.code
                + "JUMP " + endLabel + "\n"
                + "LABEL " + elseLabel + "\n"
        
        ;
    } ('else' instruction  {
        // Prise en compte du else if
        $code += $instruction.code;
            
    })?;


boucle returns[String code]:
    boucleWhile{
        $code = $boucleWhile.code;
    }
    | boucleFor{
        $code = $boucleFor.code;
    };

boucleWhile returns[String code]
@init{
    String startLabel = utils.newLabel();
    String endLabel = utils.newLabel();
    utils.pushBreakLabel(endLabel); // Empile le label de fin
    utils.pushContinueLabel(startLabel); // Empile le label de début
}
@after{
    utils.popBreakLabel();
    utils.popContinueLabel();
}
:
    'while' '(' condition ')' instruction {
        
        $code = "LABEL "+startLabel + "\n"
                + $condition.code
                + "JUMPF "+endLabel + "\n"
                + $instruction.code
                + "JUMP " + startLabel + "\n"
                + "LABEL " + endLabel + "\n"
        
        ;
    };


boucleFor returns[String code]
@init{
        String startLabel = utils.newLabel();
        String continueLabel = utils.newLabel();
        String endLabel = utils.newLabel();
        utils.pushBreakLabel(endLabel); // Empile le label de fin
        utils.pushContinueLabel(continueLabel); // Empile le label de continue
}
@after{
    utils.popBreakLabel();
    utils.popContinueLabel();
}
:
    'for' '(' a=assignation ';' b=condition ';' c=assignation ')' instruction{
        
        $code = $a.code 
                + "LABEL " + startLabel + "\n"
                + $b.code 
                + "JUMPF " + endLabel + "\n" 
                + $instruction.code 
                + "LABEL " + continueLabel + "\n"
                + $c.code
                + "JUMP " + startLabel + "\n"
                + "LABEL "+ endLabel + "\n";
};

expression returns[  String code, String type ]:
	'(' a = expression ')' {
        $code = $a.code; 
        $type = $a.type;
    }

    | '(' TYPE ')' expression {
        // CAST EN INT OU EN DOUBLE
        $code = $expression.code;
        $type = $TYPE.text;
        if(utils.isDouble($TYPE.text) && ($expression.type.equals("int") || $expression.type.equals("bool"))){
            $code += "ITOF\n";
        }
        else if(utils.isDouble($expression.type) && ($TYPE.text.equals("int") || $TYPE.text.equals("bool"))){
            
            //floot en bool
            if($TYPE.text.equals("bool")){

                $code += "PUSHF 0.0\n"
                + "FNEQ\n";

            }
            else{//floot en int
                $code += "FTOI\n";
            }
        }
    }

	| '-' e = expression {
        $code = utils.evalexpr("PUSHI 0\n", "-", $e.code, "int", $e.type);  
        $type = $e.type;
    }

	| a = expression op = ('*' | '/' | '%') b = expression {
        $code = utils.evalexpr($a.code, $op.text, $b.code, $a.type, $b.type);
        $type = utils.determineType($a.type, $b.type);
    }

	| a = expression op = ('+' | '-') b = expression {
        $code = utils.evalexpr($a.code, $op.text, $b.code, $a.type, $b.type);
        $type = utils.determineType($a.type, $b.type);
    }

	| IDENTIFIANT {
        VariableInfo vi = utils.getVar($IDENTIFIANT.text);
        $code = utils.getInstructionFromAddress(vi, "PUSH");
        
        if(utils.isDouble(vi.type)){
            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
            $code += utils.getInstructionFromAddress(vi2, "PUSH");
        }


        $type = vi.type;
    }

    | op=('--'|'++') IDENTIFIANT {
        
        VariableInfo vi = utils.getVar($IDENTIFIANT.text);
        $code = utils.getInstructionFromAddress(vi, "PUSH");

        String type = vi.type;
        $type = vi.type;

        if(utils.isDouble(vi.type)){
            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
            $code += utils.getInstructionFromAddress(vi2, "PUSH");

            $code += "PUSHF 1.0\n";
        }
        else {
            $code += "PUSHI 1\n";
        }

        String operation = "";
        switch($op.text){
            case "++":
                operation = "ADD\n";
                break;

            case "--":
                operation = "SUB\n";
                break;
        }

        //En fonction du type de la variable on ajoute F devant l'opération ou pas

        if(type.equals("double")) operation = "F" + operation;

        $code += operation;


        if(utils.isDouble(vi.type)){
            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
            $code += utils.getInstructionFromAddress(vi2, "STORE");
        }

        $code += utils.getInstructionFromAddress(vi, "STORE");


        // Pré incrémentation (une fois l'incrémentation effectuée, on stock la valeur dans la variable d'origine)
        $code += utils.getInstructionFromAddress(vi, "PUSH");


        if(utils.isDouble(vi.type)){
            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
            $code += utils.getInstructionFromAddress(vi2, "PUSH");
        }

    }


    | IDENTIFIANT op=('--'|'++') {

        VariableInfo vi = utils.getVar($IDENTIFIANT.text);
        String type = vi.type;
        $type = vi.type;


        // Post incrémentation
        $code = utils.getInstructionFromAddress(vi, "PUSH");
        if(utils.isDouble(vi.type)){
            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
            $code += utils.getInstructionFromAddress(vi2, "PUSH");
        }

        $code += utils.getInstructionFromAddress(vi, "PUSH");

        if(utils.isDouble(vi.type)){
            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
            $code += utils.getInstructionFromAddress(vi2, "PUSH");

            $code += "PUSHF 1.0\n";
        }
        else {
            $code += "PUSHI 1\n";
        }

        String operation = "";
        switch($op.text){
            case "++":
                operation = "ADD\n";
                break;

            case "--":
                operation = "SUB\n";
                break;
        }

        if(type.equals("double")) operation = "F" + operation;

        $code += operation;


        if(utils.isDouble(vi.type)){
            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
            $code += utils.getInstructionFromAddress(vi2, "STORE");
        }

        $code += utils.getInstructionFromAddress(vi, "STORE");

    }

    | IDENTIFIANT '(' args ')' // appel de fonction
        {
            $type = utils.getFunction($IDENTIFIANT.text);
            //Reserver une case pour la valeur de retour

            if(utils.isDouble($type)){
                $code = "PUSHF 0.0\n";
            }
            else{
                $code = "PUSHI 0\n";
            }
            
            $code += $args.code;
            $code += "CALL " + $IDENTIFIANT.text + "\n";
            

            //Suppression des args de la pile
            for(int i=0; i<$args.size; i++){ 
                $code += "POP \n";
            }
            
        }

    | DOUBLE {
        $code = "PUSHF " + $DOUBLE.text + "\n";
        $type = "double";
    }

	| ENTIER {
        $code = "PUSHI " + $ENTIER.text + "\n";
        $type = "int";
    }
    ;

params
    : TYPE IDENTIFIANT
        {
            utils.addParam($IDENTIFIANT.text,$TYPE.text);
        }
        ( ',' TYPE IDENTIFIANT
            {
                utils.addParam($IDENTIFIANT.text,$TYPE.text);
            }
        )*
    ;

// init nécessaire à cause du ? final et donc args peut être vide (mais $args sera non null) 
args returns [ String code, int size] 

@init{ $code = new String(); $size = 0; }

    : ( expression { 
            $code += $expression.code; 
            $size+= VariableInfo.getSize($expression.type);
        }
    ( ',' expression { 
            $code += $expression.code; 
            $size += VariableInfo.getSize($expression.type);
        }
    )*
      )?
    ;

fonction returns [ String code ]
    @init{
        $code = new String();
        utils.enterFunction();
    }
    @after{ utils.exitFunction(); }
    : TYPE IDENTIFIANT
        {
            utils.addFunction($IDENTIFIANT.text, $TYPE.text);
            $code = "LABEL " + $IDENTIFIANT.text + "\n";
        }
        '(' params ? ')' bloc
        {
            $code += $bloc.code;
            $code += "RETURN\n";  //  Return "de sécurité"
        }
         
    ;




// lexer

RETURN: 'return';

TYPE: 'int' | 'double' | 'bool';

TRUE: 'True';                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
FALSE: 'False';

IDENTIFIANT: [a-zA-Z_][a-zA-Z0-9_]*;

NEWLINE: '\r'? '\n';

WS: (' ' | '\t')+ -> skip;

ENTIER: ('0' ..'9')+;

DOUBLE: ENTIER ( ('.') ('0' ..'9')*)?;

BOOL: TRUE | FALSE;

LINE_COMMENT: '//' ~[\r\n]* -> skip;

MULTILINE_COMMENT: '/*' .*? '*/' -> skip;

UNMATCH: . -> skip;
