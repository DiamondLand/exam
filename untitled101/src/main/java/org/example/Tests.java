package org.example;

public class Tests {

    public static void main(String[] args) {
        testCountDigits_EmptyString();
        testCountDigits_NoDigits();
        testCountDigits_WithDigits();
        testCountDigits_WithSpecialCharacters();
        testCountDigits_AllDigits();
    }

    public static void testCountDigits_EmptyString() {
        int result = App.countDigits("");
        if (result == 0) {
            System.out.println("testCountDigits_EmptyString passed");
        } else {
            System.out.println("Test failed: expected 0, but got " + result);
        }
    }

    public static void testCountDigits_NoDigits() {
        int result = App.countDigits("Hello World");
        if (result == 0) {
            System.out.println("testCountDigits_NoDigits passed");
        } else {
            System.out.println("Test failed: expected 0, but got " + result);
        }
    }

    public static void testCountDigits_WithDigits() {
        int result = App.countDigits("abc123");
        if (result == 3) {
            System.out.println("testCountDigits_WithDigits passed");
        } else {
            System.out.println("Test failed: expected 3, but got " + result);
        }
    }

    public static void testCountDigits_WithSpecialCharacters() {
        int result = App.countDigits("!@#123$%");
        if (result == 3) {
            System.out.println("testCountDigits_WithSpecialCharacters passed");
        } else {
            System.out.println("Test failed: expected 3, but got " + result);
        }
    }

    public static void testCountDigits_AllDigits() {
        int result = App.countDigits("12345");
        if (result == 5) {
            System.out.println("testCountDigits_AllDigits passed");
        } else {
            System.out.println("Test failed: expected 5, but got " + result);
        }
    }
}
