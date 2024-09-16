import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
           
            System.out.print("Enter the 1st number: ");
            double num1 = scanner.nextDouble();

           
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            
            double result;

            
            switch (operator) {
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
                    
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }

            
            System.out.printf("The result of %.2f %c %.2f is %.2f%n", num1, operator, num2, result);

        } catch (ArithmeticException e) {
            
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
           
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
           
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            
            scanner.close();
        }
    }
}