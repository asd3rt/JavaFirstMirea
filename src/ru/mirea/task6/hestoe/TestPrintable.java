
package ru.mirea.task6.hestoe;

public class TestPrintable {
    public static void main(String[] args){
        Book book1 = new Book ("Grisha");
        Book book2 = new Book ("Lesha");
        Magazine magazine1 = new Magazine("Danila");
        Magazine magazine2 = new Magazine("Dima");
        Printable[] printables = {book1, book2, magazine1, magazine2};
        for(Printable printable : printables){
            printable.print();
        }

    }
}
