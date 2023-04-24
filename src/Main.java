import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator.calculation();
    }

    public class Calculator {
        public static void calculation() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first number and press Enter button:");
            if (scan.hasNextDouble()) {
                double operand1 = scan.nextDouble();
                System.out.println("Enter operation and press Enter button:");
                char operation = scan.next().charAt(0);
                System.out.println("Enter second number and press Enter button:");
                if (scan.hasNextDouble()) {
                    double operand2 = scan.nextDouble();
                    operation(operand1, operand2, operation);
                } else {
                    System.out.println("Number isn't correct");
                }
            } else {
                System.out.println("Number isn't correct");
            }
            scan.close();
        }

        private static void operation(double operand1, double operand2, char operation) {
            switch (operation) {
                case '+':
                    System.out.println("Result: " + (operand1 + operand2));
                    break;
                case '-':
                    System.out.println("Result: " + (operand1 - operand2));
                    break;
                case '*':
                    System.out.println("Result: " + (operand1 * operand2));
                    break;
                case '/':
                    System.out.println("Result: " + (operand1 / operand2));
                    break;
                default:
                    System.out.println("Operation isn't correct");
            }
        }
    }
}


