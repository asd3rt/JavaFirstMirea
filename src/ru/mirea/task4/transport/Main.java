package ru.mirea.task4.transport;
public class Main {
    public static void main(String[] args){
        Transport d1 = new Car(15, 2);
        Transport d2 = new Boat(25, 5);
        Transport d3 = new Train(90, 9);
        Transport d4 = new Plane(210, 3);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        d1.gruz();
        d2.gruz();
        d3.gruz();
        d4.gruz();
    }
}