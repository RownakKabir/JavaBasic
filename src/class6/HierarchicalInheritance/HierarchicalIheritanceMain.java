package class6.HierarchicalInheritance;

public class HierarchicalIheritanceMain {
    public static void main(String[] args) {
        HierarchicalInheritanceSecondChild s=new HierarchicalInheritanceSecondChild();
        s.name="box";
        s.shape="Square";
        s.shapeName();
        s.area=4;
        s.squareArea();
        HierarchicalInheritanceFirstChild c=new HierarchicalInheritanceFirstChild();
        c.name="Ball";
        c.shape="Circle";
        c.shapeName();
        c.r=2;
        c.circleArea();

    }

}
