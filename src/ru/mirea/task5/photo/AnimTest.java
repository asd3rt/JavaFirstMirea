package ru.mirea.task5.photo;
public class AnimTest {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0;i < args.length;i++){
            s = s + args[i];
        }
        AnimTest w = new AnimTest();
        w.setVisible(true);
    }

    private void setVisible(boolean b) {
    }

}
