interface Runnable {
    void run();
}

interface Eatable {
    void eat();
}

class Lion implements Runnable, Eatable {
    public void run() {
        System.out.println("Lion is running...");
    }

    public void eat() {
        System.out.println("Lion is eating...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.run();
        lion.eat();
    }
}
