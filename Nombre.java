// Groupe Kassi Yede et Yanis //

public class Nombre {
    public int valeur; // je crée la valeur

    public Nombre(int valeur) {
        this.valeur = valeur; // j'instancie la variable
    }

    public int valeur(){
        return valeur; //
    }

    public String toString(){
        return "Valeur du nombre : " + valeur; // Ce que représente la valeur
    }

    public static void main(String[] args) {
        Nombre nombre = new Nombre(6);
        System.out.println(nombre);
    }
}