package assignment1;

/**
 * The FitnessTracker class represents a fitness tracking application that captures user data
 * and calculates key metrics to evaluate fitness levels.
 * 
 * @author Luna Von Besser
 * @version 1.0
 */
public class FitnessTracker {

    private String firstName;
    private String lastName;
    private String gender;
    private int stepsTaken;
    private int caloriesBurned;
    private int activeMinutes;

    /**
     * Constructs a FitnessTracker object with the specified user data.
     *
     * @param firstName      The first name of the user.
     * @param lastName       The last name of the user.
     * @param gender         The gender of the user (male or female).
     * @param stepsTaken     The number of steps taken in a day.
     * @param caloriesBurned The number of calories burned in a day.
     * @param activeMinutes  The number of active minutes in a day.
     */
    public FitnessTracker(String firstName, String lastName, String gender, int stepsTaken, int caloriesBurned, int activeMinutes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.stepsTaken = stepsTaken;
        this.caloriesBurned = caloriesBurned;
        this.activeMinutes = activeMinutes;
    }

    /**
     * Returns the first name of the user.
     *
     * @return The first name of the user.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the user.
     *
     * @param firstName The first name of the user.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the user.
     *
     * @return The last name of the user.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the user.
     *
     * @param lastName The last name of the user.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the gender of the user.
     *
     * @return The gender of the user.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the user.
     *
     * @param gender The gender of the user (male or female).
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Returns the number of steps in a day.
     *
     * @return The number of steps taken in a day.
     */
    public int getStepsTaken() {
        return stepsTaken;
    }

    /**
     * Sets the number of steps taken in a day.
     *
     * @param stepsTaken The number of steps taken in a day.
     */
    public void setStepsTaken(int stepsTaken) {
        this.stepsTaken = stepsTaken;
    }

    /**
     * Returns the number of calories burned in a day.
     *
     * @return number of calories burned in a day.
     */
    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    /**
     * Sets the number of calories burned in a day.
     *
     * @param caloriesBurned number of calories burned in a day.
     */
    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    /**
     * Returns the number of active minutes in a day.
     *
     * @return average number of active minutes in a day.
     */
    public int getActiveMinutes() {
        return activeMinutes;
    }

    /**
     * Sets the number of active minutes in a day.
     *
     * @param activeMinutes average number of active minutes in a day.
     */
    public void setActiveMinutes(int activeMinutes) {
        this.activeMinutes = activeMinutes;
    }

    /**
     * Calculates the distance walked by the user based on their gender and steps taken.
     *
     * @param gender gender of the user (male or female).
     * @param stepsTaken number of steps taken in a day.
     * @return distance walked in meters.
     */
    public double distanceWalked(String gender, int stepsTaken) {
        double stepType = switch (gender.toLowerCase()) {
            case "female" -> 0.7 * stepsTaken;
            case "male" -> 0.8 * stepsTaken;
            default -> { System.out.println("Invalid entry, please type male or female"); yield 0.0; }
        };
        return stepType;
    }

    /**
     * Calculates the weekly average active minutes based on the daily active minutes.
     *
     * @param activeMinutes average number of active minutes by the user in a day.
     * @return weekly average active minutes.
     */
    public double weeklyAvgMinutes(int activeMinutes) {
        double weeklyAvgMinutes = activeMinutes * 7;
        return weeklyAvgMinutes;
    }

    /**
     * Determines the fitness level of the user based on their weekly active minutes and calories burned.
     *
     * @param activeMinutes average number of active minutes in a day.
     * @param caloriesBurned number of calories burned in a day.
     * @return fitness level of the user (Active, Moderately Active, or Sedentary).
     */
    public String fitnessLevel(int activeMinutes, int caloriesBurned) {
        if (activeMinutes * 7 > 150 && caloriesBurned * 7 > 2000) {
            return "Active";
        } else if ((activeMinutes * 7 >= 75 && activeMinutes * 7 <= 150) || 
                   (caloriesBurned * 7 >= 1000 && caloriesBurned * 7 <= 2000)) {
            return "Moderately Active";
        } else {
            return "Sedentary";
        }
    }

    /**
     * Calculates the daily calorie deficit or surplus based on the user's maintenance calories and calories burned.
     *
     * @param maintenance daily maintenance calories.
     * @param caloriesBurned number of calories burned in a day.
     * @return daily calorie deficit or surplus
     */
    public int calculateCalorieDeficit(int maintenance, int caloriesBurned) {
        return caloriesBurned - maintenance;
    }

    /**
     * Displays all the user's fitness data, including calculated metrics.
     *
     * @param maintenanceCalories user's daily maintenance calories.
     */
    public void displayFitnessData(int maintenanceCalories) {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Daily Steps: " + stepsTaken);
        System.out.println("Distance Walked: " + distanceWalked(gender, stepsTaken) + " meters");
        System.out.println("Weekly Active Minutes: " + weeklyAvgMinutes(activeMinutes));
        System.out.println("Fitness Level: " + fitnessLevel(activeMinutes, caloriesBurned));
        System.out.println("Daily Calorie Deficit/Surplus: " + calculateCalorieDeficit(maintenanceCalories, caloriesBurned));

        // You do not need to modify this piece of code; it is fine as it is.
        System.out.println("Fitness Level Criteria:");
        System.out.println("Active: More than 150 active minutes per week and over 2000 calories burned.");
        System.out.println("Moderately Active: 75-150 active minutes per week or 1000-2000 calories burned.");
        System.out.println("Sedentary: Less than 75 active minutes per week and under 1000 calories burned.");
    }
}