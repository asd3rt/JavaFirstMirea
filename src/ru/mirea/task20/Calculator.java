package ru.mirea.task20;

public class Calculator {
    public static <T extends Number, V extends Number> double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }


    public static void main(String[] args) {
        printAllResults(
                new double[]{
                        Calculator.divide(34, 6),
                        Calculator.sum(4643, 4324),
                        Calculator.multiply(432, 2),
                        Calculator.subtraction(42, 32)
                }
        );
    }

    public static void printAllResults(double[] results) {
        for (double result : results) {
            System.out.println("result = " + result + ";");
        }
    }
}