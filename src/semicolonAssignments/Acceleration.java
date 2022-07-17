package semicolonAssignments;

import java.util.Scanner;

public class Acceleration {
	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Initial Velocity: ");
		double initialVelocity = input.nextDouble();

		System.out.print("Enter Final Velocity: ");
		double finalVelocity = input.nextDouble();

		System.out.print("Enter Time: ");
		double time = input.nextDouble();

		double acceleration = (finalVelocity - initialVelocity) / time;

		System.out.printf("semicolonAssignments.Acceleration is %.4f", acceleration);
	}
}