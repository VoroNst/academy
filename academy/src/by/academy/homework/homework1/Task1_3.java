package by.academy.homework.homework1;
/**
 * Задание 3.
 * Ввести с консоли число от 1 до 10, вывести на экран таблицу умножения для этого числа. (10 чисел).
 */

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число от 1 до 10: ");
        int a = scan.nextInt();
        scan.close();
        int b = 0;
        int c;
        if (a <= 10 & a > 0) {
            while (b < 10) {
                b += 1;
                c = a * b;
                System.out.println(c);
            }
        } else System.out.println("Вы ввели не коректное число. \nВведите заново число удовлетворяющее условию.");


    }
}
