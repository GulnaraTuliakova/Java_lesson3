import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


// 9 *Напишите программу для копирования одного списка массивов в другой.

public class lesson3_8_9 {
    public static void main(String[] args) {

// 8 *Напишите программу для сортировки заданного списка массивов.

        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int r = new Random().nextInt(200);
            num.add(r);
        }
        System.out.println("Array: ");
        System.out.println(num);

        Collections.sort(num);
        System.out.println("After Sorting: ");
        System.out.println(num);

// 9 *Напишите программу для копирования одного списка массивов в другой.
        System.out.println("Array a: ");
        System.out.println(num);
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        System.out.println("Array b: ");
        System.out.println(num2);
        System.out.println("Copy a to b: ");
        num2.addAll(num);
        System.out.println("Array b: ");
        System.out.println(num2);


    }
}
