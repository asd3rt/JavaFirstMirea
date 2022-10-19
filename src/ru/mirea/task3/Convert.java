package ru.mirea.task3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.in;
public class Convert {
    public static void main(String[] args) {
        short item;
        Scanner in = new Scanner(System.in);
        System.out.print("0 выход из программы\n1-доллары \n2-евро\n3-лиры \n4-белоруские рубли\n");
        item = in.nextShort();
        switch (item) {
            case 1:
                dollar();
                break;
            case 2:
                euro();
                break;
            case 3:
                lira();
            case 4:
                belrub();
                break;
            default:System.out.println("конец программы");
                break;
        }
        in.close();
    }
    public static void dollar() {
        System.out.println("Введите количество валюты в рублях");
        Scanner s = new Scanner(in);
        int n = s.nextInt();
        System.out.println(n/61.83);
    }
    public static void euro() {
        System.out.println("Введите количество валюты в рублях");
        Scanner s = new Scanner(in);
        int n = s.nextInt();
        System.out.println(n/60.76);
    }
    public static void lira() {
        System.out.println("Введите количество валюты в рублях");
        Scanner s = new Scanner(in);
        int n = s.nextInt();
        System.out.println(n/3.33);
    }
    public static void belrub() {
        System.out.println("Введите количество валюты в рублях");
        Scanner s = new Scanner(in);
        int n = s.nextInt();
        System.out.println(n/24.49);
    }
}
