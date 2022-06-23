package by.academy.classwork.lesson3;
import java.util.Scanner;
public class Task1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        if(scan.hasNextInt()){//метод проверяет, является ли введенные данные числом, или нет
                                        // (возвращает, соответственно, true или false)
            int a  = scan.nextInt();
            System.out.println("This is a digit: "+a);
        }else{
            String a = scan.next();
            System.out.println("This is a string: "+a);
        }

        scan.close();
    }
}