package org.example;

public class Tests {

    public static void main(String[] args) {
        runTest("", 0);
        runTest("Hello World", 0);
        runTest("abc123", 3);
        runTest("!@#123$%", 3);
        runTest("12345", 5);
        runTest(null, -1);
        runTest("123abc456", 6);
        runTest("!@#$%^&*", 0);
    }

    public static void runTest(String input, int expected) {
        try {
            int result = App.countDigits(input);
            if (result == expected) {
                System.out.println("Test passed: input = \"" + input + "\", expected = " + expected + ", got = " + result);
            } else {
                System.out.println("Test failed: input = \"" + input + "\", expected = " + expected + ", but got " + result);
            }
        } catch (NullPointerException e) {
            if (expected == -1) {
                System.out.println("Test passed: input = null, expected exception caught");
            } else {
                System.out.println("Test failed: unexpected exception for null input");
            }
        }
    }
}
