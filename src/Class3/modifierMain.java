package Class3;

public class modifierMain {
    public static void main(String[] args) {


        modifier obj = new modifier();
        obj.setPrivateVariable(10);
        System.out.println("privateVariable: " + obj.getPrivateVariable());

        modifier obj1 = new modifier();
        obj1.defaultVariable = 15;
        obj1.dVariable();

        modifier obj2 = new modifier();
        obj2.publicVariable = 20;
        obj2.pVariable();
    }
}