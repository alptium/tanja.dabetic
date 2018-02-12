package tanjadab.advanced.gradebook;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	private final static Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
				System.out.println("Enter number of your students or enter 0 to quit the program:");
				int n = sc.nextInt();

				if (n == 0) {
					break;
				}

				String[] names = new String[n];
				String[] surnames = new String[n];
				double[] grades = new double[n];

				for (int i = 0; i < n; i++) {
					System.out.println("Enter name of student " + (i + 1) + ":");
					names[i] = sc.next();

					System.out.println("Enter surname of student " + (i + 1) + ":");
					surnames[i] = sc.next();

					System.out.println("Enter grade of student " + (i + 1) + ":");
					grades[i] = sc.nextDouble();

					while (grades[i] > 10) {
						logger.log(Level.WARNING, "Grade must be 10 or less!");
						System.out.println("Enter grade of student " + (i + 1) + " again:");
						grades[i] = sc.nextDouble();
					}
				}

				for (int i = 0; i < n; i++) {
					System.out.println("Grade of student " + names[i] + " " + surnames[i] + " is: " + grades[i]);
				}

				double sum = 0;
				for (int i = 0; i < n; i++) {
					sum += grades[i];
				}

				int maxStudent = 0;
				double max = 0;

				for (int i = 0; i < n; i++) {
					if (grades[i] > max) {
						max = grades[i];
						maxStudent = i;
					}
				}

				int minStudent = 0;
				double min = max;

				for (int i = 0; i < n; i++) {
					if (grades[i] < min) {
						min = grades[i];
						minStudent = i;
					}
				}

				double average = sum / n;

				System.out.println();
				System.out.println("You have " + n + " students.");
				System.out.println();
				System.out.println("Student with minimum grade is " + names[minStudent] + " " + surnames[minStudent]
						+ " and minimum grade is: " + min);
				System.out.println();
				System.out.println("Student with maximum grade is " + names[maxStudent] + " " + surnames[maxStudent]
						+ " and maximum grade is: " + max);
				System.out.println();
				System.out.println("Average grade of all students is: " + average);
			}

			System.out.println("Program is terminated!");
		}
	}
}
