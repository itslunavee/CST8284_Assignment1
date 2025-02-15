package assignment1;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * this test class contains test cases for the {@link FitnessTracker} class.
 * it tests the function of the {@code distanceWalked} and {@code calculateCalorieDeficit} methods.
 * 
 * <p><b>assumptions/modifications:</b></p>
 * <ul>
 *   <li>assumes that the {@code distanceWalked} method calculates distance based on gender:
 *     <ul>
 *       <li>for male, each step is 0.8 meters.</li>
 *       <li>for female, each step is 0.7 meters.</li>
 *     </ul>
 *   </li>
 *   <li>assumes that the {@code calculateCalorieDeficit} method calculates the difference between
 *       calories burned and maintenance calories.</li>
 *   <li>make modifications to the expected values in the failed test cases to intentionally cause test failures.</li>
 * </ul>
 */
public class FitnessTrackerTest2 {

    /**
     * tests the {@code distanceWalked} method.
     * verifies that the distance walked is calculated correctly based on the number of steps taken for a male user.
     */
	@Test
	public void testDistanceWalkedM() {
	    FitnessTracker tracker = new FitnessTracker("Chris", "Redfield", "male", 10000, 500, 60);

	    double distanceMale = tracker.distanceWalked("male", 10000);

	    assertEquals(8000.0, distanceMale, 0.001);
	    assertNotEquals(7000.0, distanceMale, 0.001);
	}

    /**
     * tests the {@code distanceWalked} method.
     * verifies that the distance walked is calculated correctly based on the number of steps taken for a female user.
     */
    @Test
    public void testDistanceWalkedF() {
        FitnessTracker tracker = new FitnessTracker("Clair", "Redfield", "female", 8000, 500, 45);

        double distanceFemale = tracker.distanceWalked("female", 10000);
        
        assertEquals(7000.0, distanceFemale, 0.001);
    }

    /**
     * tests the {@code calculateCalorieDeficit} method.
     */
    @Test
    public void testCalculateCalorieDeficit() {
        FitnessTracker tracker = new FitnessTracker("Jane", "Doe", "female", 8000, 500, 45);

        int deficit = tracker.calculateCalorieDeficit(2000, 1500);

        assertEquals(-500, deficit);
    }

    /**
     * tests the {@code fitnessLevel} method for an active level user.
     */
    @Test
    public void testFitnessLevel1() {
    	FitnessTracker tracker = new FitnessTracker("Leon", "Kennedy", "male", 10000, 500, 60);

        String fitnessLevel = tracker.fitnessLevel(60, 500);

        assertTrue(fitnessLevel.equals("Active"));
    }

    /**
     * tests the {@code fitnessLevel} method for a "Moderately Active" user.
     */
    @Test
    public void testFitnessLevel2() {
    	FitnessTracker tracker = new FitnessTracker("Jill", "Valentine", "female", 8000, 200, 21);

        String fitnessLevel = tracker.fitnessLevel(21, 200);

        assertTrue(fitnessLevel.equals("Moderately Active"));
    }

    /**
     * tests the {@code fitnessLevel} method for a "Sedentary" user.
     */
    @Test
    public void testFitnessLevel3() {
        FitnessTracker tracker = new FitnessTracker("Alice", "Wonderland", "female", 5000, 100, 10);

        String fitnessLevel = tracker.fitnessLevel(10, 100);
        
        assertTrue(fitnessLevel.equals("Sedentary"));
    }
}
