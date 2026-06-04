import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== ADVANCED CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Choose an operation: ");

            int choice = sc.nextInt();

            if (choice == 8) {
                System.out.println("Calculator Closed.");
                break;
            }

            double num1, num2, result;

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();

                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;

                case 5:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = num1 % num2;
                    System.out.println("Result = " + result);
                    break;

                case 6:
                    System.out.print("Enter base number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = sc.nextDouble();
                    result = Math.pow(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();

                    if (num1 >= 0) {
                        result = Math.sqrt(num1);
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Square root of negative number is not possible.");
                    }
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

    }
    
}
