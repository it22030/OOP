interface Machine {
    void start();
}

class Car2 implements Machine {
    public void start() {
        System.out.println("Vroom Vroom");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Car2 myCar = new Car2();
        myCar.start();
    }
}
