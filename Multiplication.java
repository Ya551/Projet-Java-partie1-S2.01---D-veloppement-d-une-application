public class Multiplication extends Operation{
    
    public Multiplication (int operande1, int operande2){
        super(operande1, operande2);
    }

    // pas de getteurs ici car déja défini dans Operation
    //operande1 = valeur1          operande2 = valeur 2
    @Override
    public int valeur(){
        return getOperande1() * getOperande2(); // multiplication des valeurs//
    }

    @Override
    public String toString() {
        int resultat = valeur();
        return "La multiplication est égale à " + resultat;
    }

    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication(5,3);
        System.out.println(multiplication);
    }

}

// La multiplication est égale à 15