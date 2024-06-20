package class6part2.abstraction;


public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    void color(){
        System.out.println("Displaying color");
    }
}
