import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class DigitCounter {

    // Метод для подсчета цифр в строке
    public static int countDigits(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    // Тесты для метода countDigits
    public static class DigitCounterTest {

        @Test
        public void testCountDigits_EmptyString() {
            Assertions.assertEquals(0, countDigits(""));
        }

        @Test
        public void testCountDigits_StringWithNoDigits() {
            Assertions.assertEquals(0, countDigits("Hello World"));
        }

        @Test
        public void testCountDigits_StringWithDigits() {
            Assertions.assertEquals(3, countDigits("abc123"));
        }

        @Test
        public void testCountDigits_StringWithSpecialCharacters() {
            Assertions.assertEquals(2, countDigits("!@#123$%"));
        }

        @Test
        public void testCountDigits_StringWithOnlyDigits() {
            Assertions.assertEquals(5, countDigits("12345"));
        }
    }
}
