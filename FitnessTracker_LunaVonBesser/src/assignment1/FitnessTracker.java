package assignment1;

/**
 * FitnessTracker.java
 * Luna Von Besser 041165988
 */
public class FitnessTracker {

    // TODO 1: INCLUDE YOUR ATTRIBUTES HERE. CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.

    // START CODE
	private String firstName;
	private String lastName;
	private String gender;
	private int stepsTaken;
	private int caloriesBurned;
	private int activeMinutes;
    // END CODE

    // TODO 2: INCLUDE YOUR CONSTRUCTOR HERE.

    // START CODE
    // END CODE

    // TODO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS DIAGRAM TO ENSURE ALL ARE COMPLETE.

    // START CODE
    // END CODE

    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// TODO 4: THIS METHOD SHOULD DISPLAY ALL USER FITNESS DATA. DO NOT MISS ANY DATA/INFORMATION.
    public void displayFitnessData() {
        
        // TODO 5: USE System.out.printf TO SHOW ALL FITNESS DATA. DO NOT MISS ANY ITEM.

        // START CODE

        // END CODE

        // You do not need to modify this piece of code; it is fine as it is.
        System.out.println("Fitness Level Criteria:");
        System.out.println("Active: More than 150 active minutes per week and over 2000 calories burned.");
        System.out.println("Moderately Active: 75-150 active minutes per week or 1000-2000 calories burned.");
        System.out.println("Sedentary: Less than 75 active minutes per week and under 1000 calories burned.");
    }

} // end class FitnessTracker