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
     * tests the {@code distanceWalked} method for a successful execution.
     * this test verifies that the distance walked by a male user is calculated correctly.
     */
    @Test
    public void testDistanceWalkedSuccess() {
        FitnessTracker tracker = new FitnessTracker("John", "Doe", "male", 10000, 500, 60);

        // test for male (test passes)
        double distanceMale = tracker.distanceWalked("male", 10000);
        assertEquals(8000.0, distanceMale, 0.001); 
    }

    /**
     * tests the {@code distanceWalked} method for a failed execution.
     * this test intentionally uses an incorrect expected value to demonstrate a test failure.
     */
    @Test
    public void testDistanceWalkedFail() {
        FitnessTracker tracker = new FitnessTracker("Jane", "Doe", "female", 8000, 500, 45);

        // test for female with incorrect expected value (test fails)
        double distanceFemale = tracker.distanceWalked("female", 10000);
        assertNotEquals(8000.0, distanceFemale, 0.001); 
    }

    /**
     * tests the {@code calculateCalorieDeficit} method for a successful execution.
     * this test verifies that the calorie deficit is calculated correctly.
     */
    @Test
    public void testCalculateCalorieDeficit_SuccessfulExecution() {
        FitnessTracker tracker = new FitnessTracker("Jane", "Doe", "female", 8000, 500, 45);

        // test calorie deficit (test passes)
        int deficit = tracker.calculateCalorieDeficit(2000, 1500);
        assertTrue(deficit < 0); 
    }

    /**
     * Tests the {@code calculateCalorieDeficit} method for a failed execution.
     * This test intentionally uses an incorrect assertion to demonstrate a test failure.
     */
    @Test
    public void testCalculateCalorieDeficit_FailedExecution() {
        FitnessTracker tracker = new FitnessTracker("John", "Doe", "male", 10000, 500, 60);

        // test calorie surplus (test fails)
        int surplus = tracker.calculateCalorieDeficit(2000, 2500);
        assertFalse(surplus > 0);
    }
}
