import java.util.Scanner;
public class Calculator_C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean t = true;
        while (t) {
            System.out.println("Enter first number and press Enter button:");
            if (scan.hasNextDouble()) {
                double operand1 = scan.nextDouble();
                while (true) {
                    System.out.println("Enter operation and press Enter button:");
                    //System.out.println(scan.nextLine());
                    String operat = scan.nextLine();
                    String operation = scan.nextLine();
                    if (operation.equals("s")) {
                        System.out.println("Bye");
                        System.exit(0);
                    } else if (operation.equals("c")){
                        System.out.println("\033[H\033[J");
                        operand1 = 0;
                        //return {label};
                    } else {
                        System.out.println("Enter next number and press Enter button:");
                        if (scan.hasNextDouble()) {
                            double operand2 = scan.nextDouble();
                            System.out.println("operand1: " + operand1);
                            if (operation.equals("+")) {
                                double result = operand1 + operand2;
                                System.out.println("Result: " + result);
                                operand1 = result;
                                System.out.println("operand1 switch: " + operand1);
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
                            Calculator_C.Proverka.proverka(symbol);
                        }
                    }
                /*} /*else {
                    System.out.println("Error");
                }*/
                }
            } else {
                String symbol = scan.nextLine();
                Calculator_C.Proverka.proverka(symbol);
            }
        }
        scan.close();
    }

    static class Proverka {
        public static void proverka(String symbol) {
            if (symbol.equals("s")) {
                System.out.println("Bye");
                System.exit(0);
            } else {
                System.out.println("Number isn't correct");
            }
        }
    }
}