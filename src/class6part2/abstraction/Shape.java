package class6part2.abstraction;

abstract class Shape {
    // Abstract method (no implementation)
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("Displaying shape.");
    }
}

