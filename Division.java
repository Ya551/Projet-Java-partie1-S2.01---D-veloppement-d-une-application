// Groupe Kassi Yede et Yanis

public class Division extends Operation{    

    public Division(int operande1, int operande2) {
       
     super(operande1, operande2);
        //TODO Auto-generated constructor stub
    }

    @SuppressWarnings("finally")
    @Override
    public int valeur(){
        int result = 0 ;
        try {
             result = getOperande1()/getOperande2();
             System.out.println("Le résultat est : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Resultat impossible : division par 0");
            
        } finally {
         return result;
        }
        
       
    } 

    @Override
    public String toString(){
        return " operande1 + operande2 ";
    }
}
