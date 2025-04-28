import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nChoose operation:");
        System.out.println("+ : Addition");
        System.out.println("- : Subtraction");
        System.out.println("* : Multiplication");
        System.out.println("/ : Division");
        System.out.print("Enter your choice: ");
        char op = sc.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operation selected!");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("\nResult: " + result);
        }

        System.out.println("===========================");
    }
}
