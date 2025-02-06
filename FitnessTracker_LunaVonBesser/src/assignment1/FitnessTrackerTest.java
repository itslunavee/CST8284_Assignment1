package assignment1;

//TEST FILE FOR FITNESS TRACKER

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Scanner;

	public class FitnessTrackerTest {
	    public static void main(String[] args) {
	        // Step 2: Prompt for user input
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first name: ");
	        String firstName = scanner.nextLine();

	        System.out.print("Enter last name: ");
	        String lastName = scanner.nextLine();

	        System.out.print("Enter gender (male/female): ");
	        String gender = scanner.nextLine();

	        System.out.print("Enter daily steps taken: ");
	        int stepsTaken = scanner.nextInt();

	        System.out.print("Enter daily calories burned: ");
	        int caloriesBurned = scanner.nextInt();

	        System.out.print("Enter daily active minutes: ");
	        int activeMinutes = scanner.nextInt();

	        System.out.print("Enter daily maintenance calories: ");
	        int maintenanceCalories = scanner.nextInt();

	        // Step 3: Instantiate the FitnessTracker object
	        FitnessTracker tracker = new FitnessTracker(
	            firstName, lastName, gender, stepsTaken, caloriesBurned, activeMinutes
	        );

	        // Step 4: Display user details and calculated metrics
	        System.out.println("\n--- User Fitness Data ---");
	        System.out.println("Name: " + tracker.getFirstName() + " " + tracker.getLastName());
	        System.out.println("Gender: " + tracker.getGender());
	        System.out.println("Daily Steps: " + tracker.getStepsTaken());
	        System.out.println("Distance Walked: " + tracker.distanceWalked() + " meters");
	        System.out.println("Weekly Active Minutes: " + tracker.averageWeeklyMinutes());
	        System.out.println("Fitness Level: " + tracker.determineFitnessLevel());
	        System.out.println("Daily Calorie Deficit/Surplus: " + tracker.calculateCalorieDeficit(maintenanceCalories));
	    }
	}

}
