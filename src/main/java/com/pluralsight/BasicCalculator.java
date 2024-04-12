package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        float num1 = scanner.nextFloat();

        System.out.println("Enter the second number:");
        float num2 = scanner.nextFloat();

        System.out.println("Possible calculations: (A)dd, (S)ubtract, (M)ultiply, (D)ivide. Please select an option:");
        String operation = scanner.next();

        float result;
        switch (operation.toUpperCase()) {
            case "A":
                result = num1 + num2;
                break;
            case "S":
                result = num1 - num2;
                break;
            case "M":
                result = num1 * num2;
                break;
            case "D":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid option, please select from (A), (S), (M), or (D).");

                return;
        }

        System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
    }
}