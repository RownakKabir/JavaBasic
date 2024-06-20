package class7;

public class Main {
    public static void main(String[] args) {

       ////////non-Generic
        NonGenericString string = new NonGenericString("Rownak");
        System.out.println(string.getStr());

        NonGenericInteger integerTest = new NonGenericInteger(100);
        System.out.println(integerTest.getInteger());


        ////////Generic
        Generic<String> stringGeneric = new Generic<>("Rownak");
        System.out.println(stringGeneric.getObj());

        Generic<Integer> integerGeneric = new Generic<>(987);
        System.out.println(integerGeneric.getObj());
    }
}
