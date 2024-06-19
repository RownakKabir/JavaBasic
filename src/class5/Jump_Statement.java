package class5;

public class Jump_Statement {
    public static void main(String[] args) {

 //////break
        int n = 10;
        for (int i = 0; i < n; i++) {
            if (i == 6)
                break;
            System.out.println(i);
        }


//////continue
        for (int i = 0; i < 10; i++) {
            if (i == 6){
                System.out.println();
                continue;
            }
            System.out.println(i);
        }











    }



}
