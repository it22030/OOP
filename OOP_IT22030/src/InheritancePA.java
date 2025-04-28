class Vehicle {
    protected String category = "Vehicle";

    void showInfo() {
        System.out.println("This is a vehicle.");
    }
}

class Car1 extends Vehicle {
    void honk() {
        System.out.println(category + " goes Beep Beep!");
    }
}

public class InheritancePA {
    public static void main(String[] args) {
        Car1 myCar = new Car1();
        myCar.showInfo();
        myCar.honk();
    }
}

