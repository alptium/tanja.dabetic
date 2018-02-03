package tanjadab.calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int num1, num2;
		int result = 0;
		String operation;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your first number:");
			num1 = sc.nextInt();

			System.out.println("Choose your operation +, -, * ,/ ");
			operation = sc.next();

			System.out.println("Enter your second number:");
			num2 = sc.nextInt();

			if (operation.equals("+")) {
				result = num1 + num2;
			} else if (operation.equals("-")) {
				result = num1 - num2;
			} else if (operation.equals("*")) {
				result = num1 * num2;
			} else if (operation.equals("/")) {
				result = num1 / num2;
			}

			System.out.println(num1 + operation + num2 + " = " + result);
		}
	}
}
