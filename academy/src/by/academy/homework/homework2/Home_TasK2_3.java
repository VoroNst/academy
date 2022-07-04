package by.academy.homework.homework2;

import java.util.Scanner;

/**
 * Задание 3.
 * Условие здачи: ввести 2 слова, состоящие из четного числа букв.
 * Получить слово состоящее из первой половины первого слова и второй половины второго слова.
 */

public class Home_TasK2_3 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 2 слова, состоящие из четного числа букв.\n");
        System.out.print("Введите 1-е слово: ");
        String str1 = scan.nextLine();
        System.out.print("Введите 2-е слово: ");
        String str2 = scan.nextLine();
        scan.close();


        String str1_1 = str1.replaceAll("\\s", "");
        String str2_1 = str2.replaceAll("\\s", "");

        if (str1_1.length() % 2 == 0) {
            if (str2_1.length() % 2 == 0) {

                String str1_2 = str1_1.substring(0, str1_1.length() / 2);
                String str2_2 = str2_1.substring(str2_1.length() / 2);
                System.out.println("Cклееное слово: " + str1_2 + str2_2);

            } else System.out.println("Введено 2-е слово не чётное");
        } else System.out.println("Введено 1-е слово не чётное");

    }
}
