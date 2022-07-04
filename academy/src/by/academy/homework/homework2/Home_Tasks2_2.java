package by.academy.homework.homework2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

/**
 * Задание 2.
 * Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
 * Если таких слов несколько, найти первое из них.
 */

public class Home_Tasks2_2 {
    public static void main(String[] args) {
        System.out.print("Введите планируемое количество слов:  ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();// Читаем с клавиатуры размер массива и записываем
        String[] arr = new String[a];// Создаём массив int размером в
        for (int i = 0; i < a; i++) {
            System.out.print("Введите слово: ");
             var input = scan.next().chars().distinct().toArray();
             char[] chr = new char[input.length];
            for (int j = 0; j < input.length; j++) {
                chr[j]=(char) input[j];
            }
            arr[i] = new String(chr);//input.chars().distinct().toArray()); // Заполняем массив элементами, введёнными с клавиатуры
        }


        var min = arr[0];
        for (String num : arr) {
            if (num.length() < min.length()) {
                min = num;
            }
        }


        System.out.println("Минимальный набор символов: " + min);





    }
}


