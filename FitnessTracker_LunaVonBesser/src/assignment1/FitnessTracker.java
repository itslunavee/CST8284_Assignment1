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
	
    public FitnessTracker(String firstName, String lastName, String gender, int stepsTaken, int caloriesBurned, int activeMinutes) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.gender = gender;
    	this.stepsTaken = stepsTaken;
    	this.caloriesBurned = caloriesBurned;
    	this.activeMinutes = activeMinutes;
    }
    
    // END CODE

    // TODO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS DIAGRAM TO ENSURE ALL ARE COMPLETE.

    // START CODE
    
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getStepsTaken() {
		return stepsTaken;
	}

	public void setStepsTaken(int stepsTaken) {
		this.stepsTaken = stepsTaken;
	}

	public int getCaloriesBurned() {
		return caloriesBurned;
	}

	public void setCaloriesBurned(int caloriesBurned) {
		this.caloriesBurned = caloriesBurned;
	}

	public int getActiveMinutes() {
		return activeMinutes;
	}

	public void setActiveMinutes(int activeMinutes) {
		this.activeMinutes = activeMinutes;
	}
	
	// END CODE
	
	public double distanceWalked(String gender) {
	    double stepType = switch (gender.toLowerCase()) {
	        case "female" -> 0.7;
	        case "male" -> 0.8;
	        default -> { System.out.println("Invalid entry, please type male or female"); yield 0.0; }
	    };
	    return stepType;
	}
	
	public double weeklyAvgMinutes(int activeMinutes) {
		double weeklyAvgMinutes = activeMinutes * 7;
		return weeklyAvgMinutes;
	}
	
	public String fitnessLevel(int activeMinutes, int caloriesBurned) {
        if (activeMinutes > 150 && caloriesBurned > 2000) {
            return "Active";
        } else if ((activeMinutes >= 75 && activeMinutes <= 150) || 
                   (caloriesBurned >= 1000 && caloriesBurned <= 2000)) {
            return "Moderately Active";
        } else {
            return "Sedentary";
        }
    }
	
	public int calculateCalorieDeficit(int maintenance, int caloriesBurned) {
	    return caloriesBurned - maintenance;
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