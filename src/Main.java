import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DigitCounter {

    /**
     * Counts the number of digits in the input string.
     *
     * @param input the input string to check
     * @return the number of digits in the input string
     */
    public static int countDigits(String input) {
        if (input == null) {
            return 0;
        }
        int count = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Sample usage
        System.out.println("Digits in 'a1b2c3': " + countDigits("a1b2c3")); // Expected: 3
    }

    // Unit tests
    public static class DigitCounterTest {

        @Test
        public void testCountDigitsWithDigitsAndLetters() {
            assertEquals(3, countDigits("a1b2c3"));
        }

        @Test
        public void testCountDigitsWithOnlyDigits() {
            assertEquals(5, countDigits("12345"));
        }

        @Test
        public void testCountDigitsWithNoDigits() {
            assertEquals(0, countDigits("abcdef"));
        }

        @Test
        public void testCountDigitsWithEmptyString() {
            assertEquals(0, countDigits(""));
        }

        @Test
        public void testCountDigitsWithNullInput() {
            assertEquals(0, countDigits(null));
        }
    }
}
