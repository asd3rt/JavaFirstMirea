package ru.mirea.task4.matrix;
import java.util.Locale;
public class Matrix {
    private double[][] m;
    private int rowsQuantity;
    private int columnsQuantity;
    public Matrix(int rowsQuantity, int columnsQuantity) {
        m = new double[rowsQuantity][columnsQuantity];
        this.rowsQuantity = rowsQuantity;
        this.columnsQuantity = columnsQuantity;
    }
    public Matrix(double[][] matrix) {
        this.m = matrix;
        rowsQuantity = matrix.length;
        columnsQuantity = matrix[0].length;
    }
    public Matrix(Matrix a) {
        this(a.getRowsQuantity(), a.getColumnsQuantity());
        for (int row = 0; row < rowsQuantity; row++) {
            for (int col = 0; col < columnsQuantity; col++) {
                this.setElement(row, col, a.getElement(row, col));
            }
        }
    }
    public int getRowsQuantity() {
        return rowsQuantity;
    }
    public int getColumnsQuantity() {
        return columnsQuantity;
    }
    public void setElement(int row, int column, double value) {
        m[row][column] = value;
    }
    public void fillRandom() {
        for (int row = 0; row < rowsQuantity; row++) {
            for (int col = 0; col < columnsQuantity; col++) {
                this.setElement(row, col, Math.random());
            }
        }
    }
    public double getElement(int row, int column) {
        return m[row][column];
    }
    public Matrix add(Matrix a) {
        if (rowsQuantity != a.getRowsQuantity() || columnsQuantity != a.getColumnsQuantity()) return new Matrix(0, 0);
        Matrix tmp = new Matrix(rowsQuantity, columnsQuantity);
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                tmp.setElement(i, j, this.getElement(i, j) + a.getElement(i, j));
            }
        }
        return tmp;
    }
    public Matrix multiply(double a) {
        Matrix tmp = new Matrix(rowsQuantity, columnsQuantity);
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                tmp.setElement(i, j, this.getElement(i, j) * a);
            }
        }
        return tmp;
    }
    public void print(String matrixName) {
        System.out.println("Matrix " + matrixName + ":");
        for (int i = 0; i < this.getRowsQuantity(); i++) {
            for (int j = 0; j < this.getColumnsQuantity(); j++) {
                System.out.printf(Locale.ROOT, "%1.4f    ", this.getElement(i, j));
            }
            System.out.println();
        }
        System.out.println();
    }
}