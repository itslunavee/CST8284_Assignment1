package assignment1;

//TEST FILE FOR FITNESS TRACKER

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Scanner;

	public class FitnessTrackerTest {
	    public static void main(String[] args) {
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

	        scanner.close();
	        
	        
	        FitnessTracker tracker = new FitnessTracker(
	            firstName, lastName, gender, stepsTaken, caloriesBurned, activeMinutes
	        );

	        
	        System.out.println("\n--- User Fitness Data ---");
	        System.out.println("Name: " + tracker.getFirstName() + " " + tracker.getLastName());
	        System.out.println("Gender: " + tracker.getGender());
	        System.out.println("Daily Steps: " + tracker.getStepsTaken());
	        System.out.println("Distance Walked: " + tracker.distanceWalked(gender) + " meters");
	        System.out.println("Weekly Active Minutes: " + tracker.weeklyAvgMinutes(activeMinutes));
	        System.out.println("Fitness Level: " + tracker.fitnessLevel(activeMinutes, caloriesBurned));
	        System.out.println("Daily Calorie Deficit/Surplus: " + tracker.calculateCalorieDeficit(maintenanceCalories, caloriesBurned));
	    }
	}
