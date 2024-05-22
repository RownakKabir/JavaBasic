package Class4;

public class DecisionMakingStatements {
    public static void main(String[] args) {
 ////Simple if statement
       int age = 25;
        if (age >= 18){
            System.out.println("You are eligible to vote.");}

////if-else statement

        int age1 = 17;
        if (age1 >= 18){System.out.println("You are eligible to vote.");}
        else {System.out.println("You are not eligible to vote.");}

///////if-else-if ladder

            int score = 85;
            if (score >= 90) {
                System.out.println("Grade: A");
            } else if (score >= 80) {
                System.out.println("Grade: B");
            } else if (score >= 70) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
///////Nested if-statement
            int num = 10;
            if (num > 0) {
                System.out.println("The number is positive.");
                if (num % 2 == 0) {
                    System.out.println("The number is even.");
                } else {
                    System.out.println("The number is odd.");
                }
            } else {
                System.out.println("The number is not positive.");
            }


////////Switch statement
            int day = 4;
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid day");
                    break;
            }







    }
}
