// Groupe Kassi Yede et Yanis

public abstract class Operation{
    private int operande1; //  car toutes les autres classes filles l'utiliseront
    private int operande2;

    public int getOperande1(){
        return operande1; // 
    }

    public int getOperande2(){
        return operande2;
    }

    public Operation(int operande1, int operande2){
        this.operande1 = operande1;
        this.operande2 = operande2;
        
    }

    public abstract int valeur();
}