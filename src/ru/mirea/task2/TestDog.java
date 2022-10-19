package ru.mirea.task2;
import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Barsik", 2);
        Dog d2 = new Dog("Ryzhyk", 7);
        Dog d3 = new Dog("Garfield",14);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.convertDogAge();
        d2.convertDogAge();
        d3.convertDogAge();
    }
}