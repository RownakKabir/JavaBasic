package Class4;

public class PrivateModifier {
/////private method
    private void privateMethod() {
        System.out.println("Private method called.");
    }



    public static void main(String[] args) {
        PrivateModifier a=new PrivateModifier();
        a.privateMethod();

    }

}
