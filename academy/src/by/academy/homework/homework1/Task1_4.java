package by.academy.homework.homework1;

/**
 * Задание 4.
 * Выводить на консоль степень двойки, пока результат не будет больше, чем 1_000_000.
 */

public class Task1_4 {
    public static void main(String[] args) {
        int a = 2;
        while (a <= 1_000_000) {
            System.out.println(a);
            a *= 2;

        }
    }
}
