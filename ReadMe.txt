Explication des scripts:

    * test.sh: Permet de lancer les tests fournis

    * custom-test.sh: Permet de lancer les tests sur nos propres benchmarks

    * run.sh: Permet de lancer la machine et compiler son propre code

    * clean.sh: Permet de nettoyer l'espace de travail en supprimant les fichiers compilés


Faits:
    B - Génération de code MVàP
    C - Traitement des variables
    D - Traitement des entrées / sorties
    E - Les opérations d’incrémentations et les blocs
    F - Traitement du « while »
    G - Traitement des conditions de base
    H - Traitement des expressions logiques
    I - Branchements
    J - Le retour des boucles : le for
    K - Fonctions
    K1 - Fonction sans argument
    K2 - Fonction avec paramètres
    K3 - Fonction avec valeur de retour
    K4 - Variables locales
    L - Support minimal des flottants
    M - Tester sur quelques programmes classiques
    O - Autres améliorations


Améliorations apportées:
    - Ajout des opérateus -= += *= /= %=

    - Supporter plusieurs types:
        * Ajout des doubles avec leur opérations: FADD,FSUB,FMUL,FDIV,PUSHF, FINF,FINFEQ,FSUP,FSUPEQ, FEQUAL, FNEQ...
        * Ajout des bool

    - Castes implicites: Nous avons pris en compte divers types de castes implicites
        * int -> double
        * double -> int
        * bool -> double
        * double -> bool
        * int -> bool
        *...

    - Break/continue dans les boucles
        * ajout des instructions break et continue
        * Prise en compte des boucles imbriquées

    - Pré/Post incrémentation/ décrémentation
        * Prise en compte de tous les types, int, double, bool

    - benchmarks ajoutés:
        * P01 à P06: Concerne les casts
        * Q01 à Q04: Concerne les instructions break
        * R01 à R04: Concerne les instructions continue
        * S01 à S04: Concerne les incrémentations et décrémentations

    