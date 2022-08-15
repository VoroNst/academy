package by.academy.homework.homework4.task1;

public class CustomDateTest {
    public static void main(String[] args) throws Exception {
        CustomDate customDate = new CustomDate("31-12-2020");
        System.out.println(customDate.getDay());
        customDate.createDate(12, 12, 2012);
        System.out.println(customDate.getDay());
        System.out.println(customDate.getDaysCount("32-10-2020", "25-10-2020"));
        System.out.println(customDate.isLeapYear());
    }
}
