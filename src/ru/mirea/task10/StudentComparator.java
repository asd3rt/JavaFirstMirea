package ru.mirea.task10;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student1> {

    @Override
    public int compare(Student1 o1, Student1 o2) {
        if (o1.getGPA() > o2.getGPA()){
            return -1;
        } else if (o1.getGPA() < o2.getGPA()){
            return 1;
        }
        else return 0;
    }
}