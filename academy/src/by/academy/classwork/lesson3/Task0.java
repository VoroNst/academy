package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Task0 {
  public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String str= scan.next();
//        System.out.println(str);
//        if(scan.hasNextInt()){
//            System.out.println("Yur string"+str);
//        }else{
//            //String str = scan.next();
//            System.out.println("Your string is "+str);
//        }
//
//        scan.close();


        Scanner scan = new Scanner(System.in);
        String month = scan.next();
       month = month.toLowerCase();//привёл в нижний регистр
        switch (month){
            case "январь":
                System.out.println("1 Месяц");
                    break;
            case "февраль":
                System.out.println("2 Месяц");
                break;
        default:
            System.out.println("ЭЭто не месяц");

        }

       // System.out.println(str);


    }

}
