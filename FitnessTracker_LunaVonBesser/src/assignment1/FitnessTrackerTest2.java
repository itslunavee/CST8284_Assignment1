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
     * tests the {@code distanceWalked} method for a male user.
     * verifies that the distance walked is calculated correctly based on the number of steps taken.
     */
    @Test
    public void testDistanceWalkedMale() {
        FitnessTracker tracker = new FitnessTracker("John", "Doe", "male", 10000, 500, 60);

        // Calculate distance walked for a male with 10,000 steps
        double distanceMale = tracker.distanceWalked("male", 10000);

        // Assert that the distance is 8000 meters (0.8 meters per step for males)
        assertEquals(8000.0, distanceMale, 0.001);
    }

    /**
     * tests the {@code distanceWalked} method for a female user.
     * verifies that the distance walked is calculated correctly based on the number of steps taken.
     */
    @Test
    public void testDistanceWalkedFemale() {
        FitnessTracker tracker = new FitnessTracker("Jane", "Doe", "female", 8000, 500, 45);

        // Calculate distance walked for a female with 10,000 steps
        double distanceFemale = tracker.distanceWalked("female", 10000);

        // Assert that the distance is 7000 meters (0.7 meters per step for females)
        assertEquals(7000.0, distanceFemale, 0.001);
    }

    /**
     * tests the {@code calculateCalorieDeficit} method.
     * verifies that the calorie deficit is calculated correctly when the user burns fewer calories than their maintenance level.
     */
    @Test
    public void testCalculateCalorieDeficit() {
        FitnessTracker tracker = new FitnessTracker("Jane", "Doe", "female", 8000, 500, 45);

        int deficit = tracker.calculateCalorieDeficit(2000, 1500);

        assertEquals(-500, deficit);
    }

    /**
     * tests the {@code fitnessLevel} method for an "Active" user.
     * verifies that the fitness level is correctly determined based on weekly active minutes and calories burned.
     */
    @Test
    public void testFitnessLevel1() {
        FitnessTracker tracker = new FitnessTracker("John", "Doe", "male", 10000, 500, 60);

        String fitnessLevel = tracker.fitnessLevel(60, 500);

        assertEquals("Active", fitnessLevel);
    }

    /**
     * tests the {@code fitnessLevel} method for a "Moderately Active" user.
     * verifies that the fitness level is correctly determined based on weekly active minutes and calories burned.
     */
    @Test
    public void testFitnessLevel2() {
        FitnessTracker tracker = new FitnessTracker("Jane", "Doe", "female", 8000, 200, 21);

        String fitnessLevel = tracker.fitnessLevel(21, 200);

        assertEquals("Moderately Active", fitnessLevel);
    }

    /**
     * tests the {@code fitnessLevel} method for a "Sedentary" user.
     * verifies that the fitness level is correctly determined based on weekly active minutes and calories burned.
     */
    @Test
    public void testFitnessLevel3() {
        FitnessTracker tracker = new FitnessTracker("Alice", "Smith", "female", 5000, 100, 10);

        String fitnessLevel = tracker.fitnessLevel(10, 100);
        
        assertEquals("Sedentary", fitnessLevel);
    }
}
