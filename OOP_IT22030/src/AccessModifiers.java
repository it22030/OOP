class Person {
    private String name;

    // Constructor to initialize name
    Person(String name) {
        this.name = name;
    }

    // Setter method
    public void updateName(String newName) {
        this.name = newName;
    }

    // Getter method
    public String retrieveName() {
        return this.name;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Person p = new Person("John Doe"); // object created with constructor
        System.out.println("Original Name: " + p.retrieveName());

        p.updateName("Michael Smith"); // changing name
        System.out.println("Updated Name: " + p.retrieveName());
    }
}
