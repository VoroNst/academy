package by.academy.classwork.lesson5;

import java.util.Locale;

/**
 * Задание 1.
  * a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
 * б) Распечатать последний символ строки. Используем метод String.charAt().
 * в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
 * г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
 * д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
 * e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
 * ж) Заменить все символы “а” на “о”.
 * з) Преобразуйте строку к верхнему регистру.
 * и) Преобразуйте строку к нижнему регистру.
 * к) Вырезать строку Java c помощью метода String.substring().
 */
public class Task1 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        System.out.println(str.length()-1);
       // System.out.println(str.charAt(13));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a","o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println/*(str.substring(7,11));*/(str.indexOf("Java").indexOf("Java")+4);
    }
}
