package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        //a = 4;
        if (a % 2 == 0) {
            System.out.println("Чётное число");
        } else System.out.println("Не чётное число");
    }
}
