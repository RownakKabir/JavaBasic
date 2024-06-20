package class6.Encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
 ReadAndWrite p=new ReadAndWrite();
 p.setName("Alif");
 System.out.println(p.getName());
 Write c = new Write();
 c.setPassword("8639");
 Read a=new Read();
 System.out.println(a.getAccount());


    }
}
