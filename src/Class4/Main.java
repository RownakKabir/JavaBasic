package Class4;

public class Main {
    public static void main(String[] args) {
        PrivateModifier a=new PrivateModifier();
      //  a.privateMethod(); ---giving  error


        DefaultModifier b=new DefaultModifier();
        b.defaultMethod();
        PublicModifier c=new PublicModifier();
        c.publicMethod(13,19);



        VoidOrNonvoid v=new VoidOrNonvoid();
        v.b=15;
        v.c=5;
        v.division();
        v.multiply(5,5);


        WithORWithoutParameters w=new WithORWithoutParameters();
        w.getNumber();
        w.printSum(10,5);




    }
}
