package Class4;

public class PublicModifier {

    public void publicMethod(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of 5 and 3 using private add method is: " + sum);
    }



    public static void main(String[] args) {
       PublicModifier a=new PublicModifier();
       a.publicMethod(10,20);

    }
}
