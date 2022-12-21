package ru.mirea.task4.transport;
abstract class Transport {
    protected int time;
    protected int cost;
    public void gruz() {
        System.out.println("Стоимость по перевозке груза= "+cost * 2.5 + " время пересадки = "+time);
    }
}