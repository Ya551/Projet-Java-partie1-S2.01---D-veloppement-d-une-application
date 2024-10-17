// Groupe Kassi Yede et Yanis

public class CalculatriceSimple {
    
    public static void main(String[] args) {
       try { Nombre six = new Nombre(6);
        Nombre dix = new Nombre(10);
        Operation s = new Soustraction(dix,six);
        System.out.println(s + " = " + s.valeur()) ; // soustraction
       }
       catch(Exception e) {
           System.out.println(""); 
       }
    }
}
