package org.example;

public class Calculator {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int substract(int x, int y) {
        return x - y;
    }

    public static int divide(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println(" Cannot divide by zero.");
            return -1;
        }
    }

    public static int multiply(int x, int y) {
        return x * y;
    }
}
