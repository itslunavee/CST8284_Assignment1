package assignment1;

//TEST FILE FOR FITNESS TRACKERd

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

        tracker.displayFitnessData(maintenanceCalories);
    }
}
