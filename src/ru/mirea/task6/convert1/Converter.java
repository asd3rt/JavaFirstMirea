package ru.mirea.task6.convert1;
import java.util.Scanner;

public class Converter implements ConvertMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите градусы в цельсиях: ");
        double celsius = in.nextDouble();
        double farenheit = (celsius * 9 / 5)  + 32;
        System.out.printf("Градусы в фаренгейтах = " + "%.2f", farenheit);
    }

    @Override
    public void convert() {

    }
}