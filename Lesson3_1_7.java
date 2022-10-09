import java.util.ArrayList;

import java.util.Scanner;

public class Lesson3_1_7 {
    public static void main(String[] args) {
// 1 Создайте новый список массивов, добавить несколько цветов (строку)
// и вывести коллекцию на экран.

        Scanner sc = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("orange");
        System.out.println("Массив: " + colors);
        System.out.println("Введите еще цвет: ");
        colors.add(sc.nextLine());
        System.out.println("Новый Массив: " + colors);

// 2 Проитерируйте все элементы списка цветов и добавте к каждому символа '!'.
        System.out.println("Добавление ! к каждому символу: ");
        for (String item : colors) {
            System.out.println(item + "!");
        }

// 3 Напишите программу для вставки элемента в список массивов в первой позиции.

        System.out.println("Вставка элемента black в первой позиции: ");
        colors.add(0, "black");
        System.out.println(colors);

// 4 Извлеките элемент (по указанному индексу) из заданного списка.

        System.out.println("Введите номер элемента, который необходимо извлечь: ");
        int n = sc.nextInt();
        int count = 0;
        for (String item : colors) {
            count += 1;
        }
        if (n > count || n <= 0) {
            System.out.println("Будь внимателен. В массиве меньше элементов:)");
        }

        else if (n <= count) {
            System.out.println(colors.get(n - 1));
        }

// 5 Обновите элемент массива по заданному индексу.
        System.out.println("Введите номер элемента, который необходимо обновить: ");
        int m = sc.nextInt();
        int countM = 0;
        for (String items : colors) {
            countM += 1;
        }
        if (m > countM || m <= 0) {
            System.out.println("Будь внимателен. В массиве меньше элементов:)");
        }

        else if (m <= countM) {
            colors.remove(m - 1);
            colors.add(m - 1, "new color");
            System.out.println(colors);
        }
// 6 Напишите программу для удаления третьего элемента из списка массивов.
        System.out.println("Удалим 3 элемент массива");

        colors.remove(2);
        System.out.println(colors);

// 7 Напишите программу для поиска элемента в списке массивов.
    System.out.println("Введите цвет: ");
    String wantColor = sc.nextLine();
        for (String itemS : colors) {
        if (wantColor.contains(itemS)){
        System.out.println("В масcиве есть такой цвет");
    }
}



}
}
