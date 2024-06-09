package Claas2;

public class Operators {
    public static void main(String[] args) {
    int x = 5;
    int y = 10;

        System.out.println( x++);
        System.out.println(++y);
        System.out.println( x--);
        System.out.println(--y);



        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(y / x );
        System.out.println(y % x);


        System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(x <= y);
        System.out.println (x >= y);
        System.out.println (x == y);
        System.out.println (x != y);


    boolean p = true;
    boolean q = false;
        System.out.println (p && q);
        System.out.println (p || q);


    int min = (x < y) ? x : y;

        System.out.println(min);

    int result=2;
    result += 10;/// result=result+10
        System.out.println( result);
    result -= 5; //result=result- 5
        System.out.println( result);
    result *= 2;
        System.out.println( result);
    result /= 4;
        System.out.println( result);
    result %= 3;
        System.out.println( result);
}
}
