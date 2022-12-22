package ru.mirea.task20;

public class numb2<T, V, K> {
    private T t;
    private V v;
    private K k;

    public numb2(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "numb2{" +
                "t= " + t + "(" + t.getClass().getName() + ")" +
                ", v=" + v + "(" + v.getClass().getName() + ")" +
                ", k=" + k + "(" + k.getClass().getName() + ")" +
                '}';
    }

    public static void main(String[] args) {
        numb2<Integer, String, Double> numb2 = new numb2<>(1, "2", 3.0);
        System.out.println(numb2);
    }
}