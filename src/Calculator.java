import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number and press Enter button:");
        if (scan.hasNextDouble()) {
            double operand1 = scan.nextDouble();
            while (true) {
                System.out.println("Enter operation and press Enter button:");
                // Следующая строка с переменной operat добавлена, так как не происходл переход на  строку
                //с переменной operation. Срабатывает если добавляю что-то, например, также System.out.println(scan.nextLine());
                String operat = scan.nextLine();
                String operation = scan.nextLine();
                if (operation.equals("s")) {
                    System.out.println("Bye");
                    System.exit(0);
                } else {
                    System.out.println("Enter next number and press Enter button:");
                    if (scan.hasNextDouble()) {
                        double operand2 = scan.nextDouble();
                        if (operation.equals("+")) {
                            double result = operand1 + operand2;
                            System.out.println("Result: " + result);
                            operand1 = result;
                        } else if (operation.equals("-")) {
                            double result = operand1 - operand2;
                            System.out.println("Result: " + result);
                            operand1 = result;
                        } else if (operation.equals("*")) {
                            double result = operand1 * operand2;
                            System.out.println("Result: " + result);
                            operand1 = result;
                        } else if (operation.equals("/")) {
                            double result = operand1 / operand2;
                            System.out.println("Result: " + result);
                            operand1 = result;
                        } else {
                            System.out.println("Operation isn't correct");
                        }
                    } else {
                        String symbol = scan.nextLine();
                        proverka(symbol);
                    }
                }
            }
        } else {
            String symbol = scan.nextLine();
            proverka(symbol);
        }
        scan.close();
    }

    private static void proverka(String symbol) {
        if (symbol.equals("s")) {
            System.out.println("Bye");
            System.exit(0);
        } else {
            System.out.println("Number isn't correct");
        }
    }
}


