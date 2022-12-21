package ru.mirea.task4.transport;
public class Plane extends Transport {
    public Plane(int cost, int time) {
        this.cost=cost;
        this.time=time;
    }
    public String toString() {
        return "Plane{" +
                "time=" + time +
                "} " + "cost= " + cost+"  Стоимость для пассажира";
    }
}