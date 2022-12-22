package ru.mirea.task18;

public class num1 {
    public void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        num1 t = new num1();
        t.exceptionDemo();
    }
}