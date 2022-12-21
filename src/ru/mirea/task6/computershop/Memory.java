package ru.mirea.task6.computershop;

public class Memory {
    private int size;

    @Override
    public String toString() {
        return "Memory{" +
                "size=" + size +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Memory(int size) {
        this.size = size;
    }
}

