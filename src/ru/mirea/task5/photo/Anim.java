package ru.mirea.task5.photo;

import javax.swing.*;
import java.awt.*;

public class Anim extends JFrame {
    private JLabel pictureLabel;
    private Container controls;
    public Anim(String s) {
        super("Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(false);
        this.setSize(1000, 620);
        //this.main(this);
        this.startWindow(s);
    }

    private void startWindow(String s) {
        controls = new Container();
        controls = getContentPane();
        controls.setLayout(new GridLayout());
        pictureLabel = new JLabel(new ImageIcon("C:\\Users\\CALIFORNIA\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task5\\photo\\президентjpg","test"));
        controls.add(pictureLabel);
    }

}
