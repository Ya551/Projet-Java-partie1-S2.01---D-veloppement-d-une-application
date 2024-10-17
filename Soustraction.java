// Groupe Kassi Yede et Yanis

public class Soustraction extends Operation{
    
    
    public Soustraction(int operande1, int operande2){
        super(operande1, operande2);
    }

    @Override
    public int valeur(){
        return getOperande1() - getOperande2(); // soustraction des valeurs //
    }
    
    @Override
    public String toString() {
        int resultat = valeur();
        return "La soustraction est égale à" + resultat;
    }

    public static void main(String[] args) {
        Soustraction soustraction = new Soustraction(9,6);
        System.out.println(soustraction);
    } 

}

// La soustraction est égale à 3