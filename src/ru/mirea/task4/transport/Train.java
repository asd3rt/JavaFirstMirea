package ru.mirea.task4.transport;
public class Train extends Transport {
    public Train(int cost, int time) {
        this.cost=cost;
        this.time=time;
    }
    public String toString() {
        return "Train{" +
                "time=" + time +
                "} " + "cost= " + cost+"  Стоимость для пассажира";
    }
}