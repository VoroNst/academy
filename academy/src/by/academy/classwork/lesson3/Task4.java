package by.academy.classwork.lesson3;

public class Task4 {
    public static void main(String[] args) {
        int s =370_000,
                sec,
                m,
                min,
                h;
        sec=s%60;
        m=(s-sec)%60;
        min = m%60;
        h =(m-min)/60;
        System.out.println(h+" часов"+min+" минут"+sec+" секунд");
    }
}