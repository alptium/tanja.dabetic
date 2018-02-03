package tanjadab.gradebook;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String[] names = new String[5];
		String[] surnames = new String[5];
		double[] grades = new double[5];
		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Enter name of student:");
				names[i] = sc.next();
				System.out.println("Enter surname of student:");
				surnames[i] = sc.next();
				System.out.println("Enter grade of student:");
				grades[i] = sc.nextDouble();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("Grade of student:" + names[i] + " " + surnames[i] + " is:" + grades[i]);
			}
			double sum = 0;
			for (int i = 0; i < 5; i++) {
				sum += grades[i];
			}
			double average = sum / 5;
			System.out.println("Average is:" + average);
		}
	}
}
