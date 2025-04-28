class Car {
    private String color;
    private int speed;

    // Constructor
    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    void drive() {
        System.out.println("The " + color + " car is driving at " + speed + " km/h.");
    }

    // Getter methods
    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Car myCar = new Car("Blue", 120); // object creation using constructor
        myCar.drive();

        System.out.println("Car Color: " + myCar.getColor());
        System.out.println("Car Speed: " + myCar.getSpeed() + " km/h");
    }
}

