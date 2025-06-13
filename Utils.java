import java.util.*;

class Utils extends TablesSymboles{

    private Stack<String> breakLabels = new Stack<>();
    private Stack<String> continueLabels = new Stack<>();

    public Utils(){
        super();
    }
    
    public static String getInstructionFromAddress(VariableInfo vi, String cmdName) {
        if (vi.scope == VariableInfo.Scope.GLOBAL) {
            return cmdName + "G " + vi.address + "\n";
        }
        return  cmdName + "L " + vi.address + "\n";
    }

    public String getInstruction(String name, String cmdName) {
        VariableInfo vi = getVar(name);
        return getInstructionFromAddress(vi, cmdName);
    }

    public boolean isDouble(String type){
        return type.equals("double");
    }

    public boolean isInt(String type){
        return type.equals("int");
    }
    /**
     * Next Label
     */
    private int currentLabel = 1;

    /**
     * @return new Label
     */
    public String newLabel( ) {
        return "Label"+(currentLabel++); 
    };

    public String determineType(String type1, String type2){
        if(type1.equals("double") || type2.equals("double")){
            return "double";
        }
        return "int";
    }


    public String evalexpr (String x, String op, String y, String xType, String yType) {

        String type = "int";
        String operation = "";
        if(xType.equals(yType)){
            type = xType;
        }

        String code = x;
        if((xType.equals("int") || xType.equals("bool")) && yType.equals("double")){
            code += "ITOF\n";
            type = "double";
            System.err.println("Warning : les types ne matchent pas -> conversion implicite vers double");
        }

        code += y;
        if(xType.equals("double") && (yType.equals("int") || yType.equals("bool"))){
            code += "ITOF\n";
            type = "double";
            System.err.println("Warning : les types ne matchent pas -> conversion implicite vers double");
        }

        switch(op) {
            case "*":{
                operation = "MUL\n";
                break;
            }

            case "+":{
                operation = "ADD\n";
                break;
            }

            case "-":{
                operation = "SUB\n";
                break;
            }

            case "/":{
                operation = "DIV\n";
                break;
            }

            case "%":{
                operation = "MOD\n";
                break;
            }

            case "==":{
                operation = "EQUAL\n";
                break;
            }

            case "!=":{
                operation = "NEQ\n";
                break;
            }
            
            case ">":{
                operation = "SUP\n";
                break;
            }

            case ">=":{
                operation = "SUPEQ\n";
                break;
            }

            case "<":{
                operation = "INF\n";
                break;
            }

            case "<=":{
                operation = "INFEQ\n";
                break;
            }

            case "<>":{
                operation = "NEQ\n";
                break;
            }

            default:{
                System.err.println("Opérateur arithmétique incorrect : '"+op+"'");
                throw new IllegalArgumentException("Opérateur arithmétique incorrect : '"+op+"'");
            }
        }
        //System.out.println(xType+" "+yType+" "+type);
        if(type.equals("double")) operation = "F" + operation;

        return code + operation;
    }


    public void pushBreakLabel(String label) {
        breakLabels.push(label);
    }

    public String popBreakLabel() {
        return breakLabels.pop();
    }

    public String generateBreak() {

        if (breakLabels.isEmpty()) {
            System.err.println("Erreur: 'break' utilisé en dehors d'une boucle");
            System.exit(1);
        }

        String breakInstruction = "JUMP " + breakLabels.peek() + "\n";

        //popBreakLabel();

        return breakInstruction;
    }


    public void pushContinueLabel(String label) {
        continueLabels.push(label);
    }

    public String popContinueLabel() {
        return continueLabels.pop();
    }

    public String generateContinue() {

        if (continueLabels.isEmpty()) {
            System.err.println("Erreur: 'continue' utilisé en dehors d'une boucle");
            System.exit(1);
        }

        String continueInstruction = "JUMP " + continueLabels.peek() + "\n";

        //popContinueLabel();

        return continueInstruction;
    }

}
