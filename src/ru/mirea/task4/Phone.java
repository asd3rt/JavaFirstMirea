
package ru.mirea.task4;
public class Phone {
    String number;
    String model;
    double weight;
    String message = "Дай деняк пжпжпж";
    String name = "БАНК";
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone() {
    }
    public void receiveCall() {
        System.out.println("Звонит "+name);
    }
    public void getNumber() {
        System.out.println(number);
    }
    public void sendMessage() {
        System.out.println(message);
    }
    public static void main(String[] args) {
        Phone Samsung = new Phone();
        Samsung.number = "+78005555550";
        Samsung.model = "Samsung Galaxy S22 Ultra 12/512Gb";
        Samsung.weight = 228;
        Phone Iphone = new Phone();
        Iphone.number = "+78005557778";
        Iphone.model = "Apple iPhone 13 Pro Max 128Gb";
        Iphone.weight = 240;
        Phone Xiaomi = new Phone();
        Xiaomi.number = "+78001002424";
        Xiaomi.model = "Xiaomi 12 Pro 12/256Gb";
        Xiaomi.weight = 205;
        Samsung.receiveCall();
        Iphone.receiveCall();
        Xiaomi.receiveCall();
        Samsung.getNumber();
        Iphone.getNumber();
        Xiaomi.getNumber();
        Samsung.sendMessage();
        Iphone.sendMessage();
        Xiaomi.sendMessage();
        System.out.print("Samsung: Номер "+ Samsung.number+" модель "+Samsung.model+" weight= "+Samsung.weight);
        System.out.println();
        System.out.print("Nokia: Номер "+ Iphone.number+" модель "+Iphone.model+" weight= "+Iphone.weight);
        System.out.println();
        System.out.print("Meizu: Номер "+ Xiaomi.number+" модель "+Xiaomi.model+" weight= "+Xiaomi.weight);
    }
}
