package tanjadab.advanced.gradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {		
			System.out.println("Enter number of your students:");
			int n = sc.nextInt();
					
			String[] names = new String[n];
			String[] surnames = new String[n];
			double[] grades = new double[n];
			
			for (int i = 0; i < n; i++) {
				System.out.println("Enter name of student " + (i+1) + ":");
				names[i] = sc.next();

				System.out.println("Enter surname of student " + (i+1) + ":");
				surnames[i] = sc.next();

				System.out.println("Enter grade of student " + (i+1) + ":");
				grades[i] = sc.nextDouble();
			}

			for (int i = 0; i < n; i++) {
				System.out.println("Grade of student " + names[i] + " " + surnames[i] + " is: " + grades[i]);
			}

			double sum = 0;
			for (int i = 0; i < n; i++) {
				sum += grades[i];
			}					

			double average = sum / n;
			System.out.println("Average is: " + average);
		}
	}
}
