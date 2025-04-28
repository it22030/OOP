abstract class Shape {
    abstract void draw();

    void displayInfo() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.displayInfo();
    }
}
