package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Tasks_3 {
    public static void main(String[] args) {
        /**
         * 0. Ввести через консоль название месяца -> вывести номер месяца (использовать switch/case)
         */
        System.out.print("      Task 0 \nВведите название месяца: ");
        //Scanner scan1 = new Scanner(System.in);
        //String str0 = scan1.next();
        //scan1.close();
        String str0 = "Декабрь";
        String str01 = str0.toLowerCase();
        switch (str01) {
            case ("январь"):
                System.out.println("Январь это 1 месяц года");
                break;
            case ("февраль"):
                System.out.println("Февраль это 2 месяц года");
                break;
            case ("март"):
                System.out.println("Март это 3 месяц года");
                break;
            case ("апрель"):
                System.out.println("Апрель это 4 месяц года");
                break;
            case ("май"):
                System.out.println("Май это 5 месяц года");
                break;
            case ("июнь"):
                System.out.println("Июнь это 6 месяц года");
                break;
            case ("июль"):
                System.out.println("Июль это 7 месяц года");
                break;
            case ("август"):
                System.out.println("Август это 8 месяц года");
                break;
            case ("сентябрь"):
                System.out.println("Сентябрь это 9 месяц года");
                break;
            case ("октябрь"):
                System.out.println("Октябрь это 10 месяц года");
                break;
            case ("ноябрь"):
                System.out.println("Ноябрь это 11 месяц года");
                break;
            case ("декабрь"):
                System.out.println("Декабрь это 12 месяц года");
                break;
            default:
                System.out.println("ЭЭто не месяц");
        }


        /**
         * 1. Проинициализировать 3 целочисленных числа:
         * 	 a = 2_123_000
         * 	 b = 100
         * 	 c = 234
         * 	 Найти a / b * c
         * 	 Ответ: (4_967_820)
         */
        System.out.println("\n      Task 1 ");
        int a = 2_123_000;
        int b = 100;
        int c = 234;
        int d = a / b * c;
        System.out.println(d);


        /**
         * 2. Изменить переменные и строку вывода в программе так,
         *          чтобы она рассчитывала и печатала следующее выражение:
         *          3*3+4*4=25
         *          class Task {
         *          public static void main(String[] args) {
         *          int i = 2;
         *          int j = 3;
         *          int k = i + j;
         *          System.out.println(i + "+" + j + "=" + k);
         *          }
         *          }
         */
        System.out.println("\n      Task 2 ");
        int i = 3;
        int j = 4;
        int k = i * i + j * j;
        System.out.println(i + "*" + i + "+" + j + "*" + j + "=" + k);


        /**
         * 3. Создайте число. Определите, является ли число
         * четным или не четным, вывести текстовое сообщение.
         */
        System.out.println("\n      Task 3 ");
        int a3 = 6;
        if (a3 % 2 == 0) {
            System.out.println("Чётное число");
        } else System.out.println("Не чётное число");

        /**
         * 4. Перепишите программу:
         * public class Main {
         * public static void main(String[] args) {
         * int s = 370_000;
         * int sec;
         * int m;
         * int min;
         * int h;
         * sec = s % 60;
         * m = (s - sec) / 60;
         * min = m % 60;
         * h = (m - min) / 60;
         * System.out.println(h + " часов " + min + " минут "
         * + sec + " секунд");
         * }
         * }
         * // Продолжить пример, добавить расчет и вывод суток
         * и недель. (месяц по желанию)
         */
        System.out.println("\n      Task 4 ");
        int s = 11370_000;
        int sec;
        int m;
        int min;
        int h;
        int hour;
        int day;
        int w;
        int week;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;//
//        hour = h % 24;
//        day = (h-hour)/ 24;
//        w= day%7;
//               // week

//        System.out.println(w + " недель "+ day + " суток " + hour + " часов " + min + " минут " + sec + " секунд");
//        System.out.println(day + " суток " + hour + " часов " + min + " минут " + sec + " секунд");
        System.out.println(h + " часов " + min + " минут " + sec + " секунд");

        /**
         * 5. Ввести с консоли 2 числа, найти большее, меньшее,
         * среднее арифметическое.
         */
        System.out.println("\n      Task 5 ");
        //Scanner scan5 = new Scanner(System.in);
        //System.out.print("Введите первое число: ");
        //double a5 = scan5.nextDouble();
        //System.out.print("Введите второе число: ");
        //double b5 = scan5.nextDouble();
        //scan5.close();
        int a5=3, b5=2;
        if (a5 > b5){
            System.out.println(a5+" болшее чисо чем число " + b5);
        }else if (a5 < b5){
            System.out.println(a5+" меньше чисо чем число " + b5);
        }else if (a5 == b5) {
            System.out.println(a5 + " равное чисо " + b5);
        }
        System.out.println("Cреднее арифметическое число вводимых чисел = "+(a5+b5)/2);
    }
}
