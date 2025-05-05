import task1.MyArrayList;
import task2.BadKey;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Task1 ----------");
        // Пример 1: работа со строками
        System.out.println("=== Пример со строками ===");
        MyArrayList<String> stringList = new MyArrayList<>();
        stringList.add("Кот");
        stringList.add("собака");
        stringList.add("тигр");
        stringList.add("привет");

        System.out.println("Элементы:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        System.out.println("Размер списка: " + stringList.size());
        stringList.remove(2); // удаляем "тигр"

        System.out.println("После удаления элемента с индексом 2:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        System.out.println("Размер списка: " + stringList.size());


        // Пример 2: работа с числами
        System.out.println("\n=== Пример с числами ===");
        MyArrayList<Integer> intList = new MyArrayList<>();
        for (int i = 1; i <= 8; i++) {
            intList.add(i * 10);
        }

        System.out.println("Элементы:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }

        System.out.println("Размер списка: " + intList.size());

        intList.remove(0);
        intList.remove(5);
        intList.remove(intList.size() - 1);

        System.out.println("\nПосле удаления элементов:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }

        System.out.println("\nРазмер списка: " + intList.size());
        System.out.println();

        System.out.println("---------- Task2 ----------");
        Map<BadKey, String> map = new HashMap<>();
        int threshold = 20;
        for (int i = 1; i <= threshold; i++) {
            map.put(new BadKey(i), "Value " + i);

            System.out.println("Iteration " + i);
            System.out.println("Map size: " + map.size());

            if (i < 8) {
                System.out.println("Bucket type: Node (linked list)");
            } else if (i == 8) {
                System.out.println("Bucket transformed to: TreeNode");
            } else {
                System.out.println("Bucket type: TreeNode");
            }

            System.out.println("---------------------------------");
        }
    }
}