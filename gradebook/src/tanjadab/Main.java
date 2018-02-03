package tanjadab;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String[] name = new String[5];
		String[] surname = new String[5];
		double[] grade = new double[5];

		try (Scanner sc = new Scanner(System.in)) {

			for (int i = 0; i < 5; i++) {
				System.out.println("Enter name of student:");
				name[i] = sc.next();

				System.out.println("Enter surname of student:");
				surname[i] = sc.next();

				System.out.println("Enter grade of student:");
				grade[i] = sc.nextDouble();

			}

			for (int i = 0; i < 5; i++) {
				System.out.println("Grade od student:" + name[i] + " " + surname[i] + " is:" + grade[i] + "\n");
			}

			double total = 0;
			double addGrades = 0;
			for (int i = 0; i < 5; i++) {
				addGrades += grade[i];
			}
			total = addGrades / 5;

			System.out.println("Total grade is:" + total);
		}
	}
}
