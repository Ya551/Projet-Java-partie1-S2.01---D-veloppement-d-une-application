// Groupe Kassi Yede et Yanis //

public class Addition extends Operation{

    public Addition(int operande1, int operande2){
        super(operande1, operande2);
    }

    // pas de getteurs ici car déja défini dans Operation
    
    @Override
    public int valeur(){
        return getOperande1() + getOperande2(); // somme de l'operation //
    }

    @Override
    public String toString() {
        int resultat = valeur();
        return "L'addition est égale à:" + resultat;
    }

    public static void main(String[] args) {
        Addition addition = new Addition(5,3);
        System.out.println(addition);
    }
}

// L'addition est égale à 15