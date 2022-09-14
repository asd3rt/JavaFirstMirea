/*
package ru.mirea.task1.PervoeZadanie;
public class Java {
    public static void main(String[] args) {
        int[] array={1,4,6,8,9,0,9};
        int sum=0;
        for (int i=0; i<array.length; i++){
            sum+=array[i];
        }
        System.out.println("SUMMA= " + sum);
    }
}

 */
/*
package ru.mirea.task1.PervoeZadanie;
public class Java {
    public static void main(String[] args) {
        int[] array={1,4,6,8,9,0,9};
        int sum=0;
        int i=0;
        while (i<array.length){
            sum+=array[i];
            i++;
        }
        System.out.println("SUMMA = " + sum);
    }
}

 */
/*
package ru.mirea.task1.PervoeZadanie;
public class Java {
    public static void main(String[] args) {
        int[] array={1,4,6,8,9,0,9};
        int sum=0;
        int i=0;
        do{
            sum+=array[i];
            i++;
        }while (i<array.length);
        System.out.println("SUMMA = " + sum);
    }
}

 */
/*
package ru.mirea.task1.PervoeZadanie;
public class Java {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Country - " + args[i]);
        }
    }
}
 */
/*
package ru.mirea.task1.PervoeZadanie;
public class Java {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(1./i);
        }
    }
}
 */
/*
package ru.mirea.task1.PervoeZadanie;
public class Java {
    public static void main(String[] args) {
        int[] array;
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
            System.out.println(array[i]);
        }
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
*/
/*
package ru.mirea.task1.PervoeZadanie;
public class Java {
    public static void main(String[] args) {
        int f = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            f=f*i;
        }
        System.out.println(f);
    }
}
*/