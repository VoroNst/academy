package by.academy.homework.homework2;

import java.util.Scanner;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Задание 1.
 * Ввести две строки с консоли. Определить, является ли одна строка перестановкой символов другой строки.
 * Учитываем регистр. Не использовать сортировку :)
 * Например:
 * 1.	“hello” и “hlleo” -> true
 * 2.	“hello” и “art” -> false
 */
public class Home_Task2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите строку1: ");
        String str1 = scan.nextLine();

        System.out.print("Введите строку2: ");
        String str2 = scan.nextLine();

        scan.close();


        Map<Character, Long> map1 = str1.chars().mapToObj(c -> new Character((char) c)).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        Map<Character, Long> map2 = str2.chars().mapToObj(c -> new Character((char) c)).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(map1);
        System.out.println(map2);

        System.out.println();
        System.out.println(map1.equals(map2) ? "ОК" : "not OK");


//        System.out.println("Ошибка: количество символов первой строки отличается" +
//                " от количества символов второй строки");


    }
}

