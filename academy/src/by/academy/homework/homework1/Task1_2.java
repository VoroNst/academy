package by.academy.homework.homework1;
/**
 * Задание 2.
 * Используем switch/case. Ввести с консоли тип данных(созраняем в String) и переменную, вывести на экран:
 * 	a) если тип данных int, вывести остаток от деления на 2
 * 	b) если double, вывести 70% от числа
 * 	c) если float, возвести в квадрат
 * 	d) если char, вывести код символа (charAt(0))
 * 	e) String, вывести на экран строку в виде ("Hello " + переменная)
 * 	f) во всех остальных случаях вывести на экран ("Unsupported type");
 */

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        System.out.print("Введите тип  данных " + " (int, double, float, char, String): ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        str = str.toLowerCase();
        System.out.print("Введите переменную согласно введенного типа данных: ");

        switch (str) {
            case "int":
                int a1 = scan.nextInt();
                System.out.println(a1 % 2);
                break;
            case "double":
                double a2 = scan.nextDouble();
                System.out.println(a2 * 0.70);
                break;
            case "float":
                float a3 = scan.nextFloat();
                System.out.println(a3 * a3);
                break;
            case "char":
                char ch = scan.next().charAt(0);
                System.out.println((int) ch);
                break;
            case "string":
                Scanner scan1 = new Scanner(System.in);
                String a5 = scan1.nextLine();
                scan1.close();
                System.out.println("Hello " + a5);
                break;
            default:
                System.out.println("Unsupported type");
                scan.close();

        }
    }
}

