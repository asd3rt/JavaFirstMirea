package ru.mirea.task4.transport;
public class Car extends Transport {
    public Car(int cost, int time) {
        this.cost=cost;
        this.time=time;
    }
    public String toString() {
        return "Plane{" +
                "time=" + time +
                "} " + "cost= " + cost+"  Стоимость для пассажира";
    }
}