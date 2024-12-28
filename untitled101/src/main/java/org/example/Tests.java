package org.example;

public class Tests {

    public static void main(String[] args) {
        testCountDigits();
    }

    public static void testCountDigits() {
        int result = App.countDigits("");
        if (result == 0) {
            System.out.println("testCountDigits_EmptyString passed");
            System.out.println(result);
        } else {
            System.out.println("Test failed: expected 0, but got " + result);
        }

        result = App.countDigits("Hello World");
        if (result == 0) {
            System.out.println("testCountDigits_NoDigits passed");
            System.out.println(result);
        } else {
            System.out.println("Test failed: expected 0, but got " + result);
        }

        result = App.countDigits("abc123");
        if (result == 3) {
            System.out.println("testCountDigits_WithDigits passed");
            System.out.println(result);
        } else {
            System.out.println("Test failed: expected 3, but got " + result);
        }

        result = App.countDigits("!@#123$%");
        if (result == 3) {
            System.out.println("testCountDigits_WithSpecialCharacters passed");
            System.out.println(result);
        } else {
            System.out.println("Test failed: expected 3, but got " + result);
        }

        result = App.countDigits("12345");
        if (result == 5) {
            System.out.println("testCountDigits_AllDigits passed");
            System.out.println(result);
        } else {
            System.out.println("Test failed: expected 5, but got " + result);
        }

        try {
            result = App.countDigits(null);
            System.out.println("Test failed: expected exception for null input, but got " + result);
        } catch (NullPointerException e) {
            System.out.println("testCountDigits_NullInput passed (caught expected NullPointerException)");
        }

        result = App.countDigits("123abc456");
        if (result == 6) {
            System.out.println("testCountDigits_MixedCharacters passed");
            System.out.println(result);
        } else {
            System.out.println("Test failed: expected 6, but got " + result);
        }

        result = App.countDigits("!@#$%^&*()");
        if (result == 0) {
            System.out.println("testCountDigits_NoDigitsInSpecialCharacters passed");
            System.out.println(result);
        } else {
            System.out.println("Test failed: expected 0, but got " + result);
        }
    }
}
