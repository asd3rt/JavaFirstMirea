
package ru.mirea.task5.odnophoto;
    public class Animation1Test {
        public static void main(String[] args) {
            String s = "";
            for (int i = 0;i < args.length;i++){
                s = s + args[i];
            }
            Animation1 w = new Animation1(s);
            w.setVisible(true);
        }
    }









