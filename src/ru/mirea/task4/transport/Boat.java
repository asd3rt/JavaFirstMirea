package ru.mirea.task4.transport;
public class Boat extends Transport {
    public Boat(int cost, int time) {
        this.cost=cost;
        this.time=time;
    }
    public String toString() {
        return "Boat{" +
                "time=" + time + "} " + "cost= " + cost+"  Стоимость для пассажира";
    }
}