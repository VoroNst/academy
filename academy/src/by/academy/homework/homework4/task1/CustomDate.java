package by.academy.homework.homework4.task1;

import by.academy.homework.dial.validators.DateValidator;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

/**
 * **Создать класс CustomDate, используя вложенные классы Год, Месяц, День.
 * **Методы: задать дату, вывести на консоль день недели по заданной дате.
 * День недели представить в виде перечисления.
 * Рассчитать количество дней, в заданном временном промежутке.
 * Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки.
 * После валидации в конструкторе создаем объекты класса Year, Month, Day.
 * Добавить метод, который проверяет высокосный ли год или нет.
 */
public class CustomDate {
    class Ear {
        private int year;

        public Ear(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }
    }

    class Month {
        private int month;

        public Month(int month) {
            this.month = month;
        }

        public int getMonth() {
            return month;
        }
    }

    class Day {
        private int day;

        public Day(int day) {
            this.day = day;
        }

        public int getDay() {
            return day;
        }
    }

    private Ear year;
    private Month month;
    private Day day;

    public CustomDate(int day, int month, int year) {
        this.year = new Ear(year);
        this.month = new Month(month);
        this.day = new Day(day);
    }

    public CustomDate(String date) throws Exception {
        DateValidator validator = new DateValidator();
        boolean isValid = validator.validate(date);
        if (!isValid)
            throw new Exception("Date is not valid!");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dateTime = LocalDate.parse(date, formatter);

        year = new Ear(dateTime.getYear());
        month = new Month(dateTime.getMonth().getValue());
        day = new Day(dateTime.getDayOfWeek().getValue());
    }

    public void createDate(int day, int month, int year) {
        this.year = new Ear(year);
        this.month = new Month(month);
        this.day = new Day(day);
    }

    public long getDaysCount(String inputString1, String inputString2) {
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date1 = LocalDate.parse(inputString1, dtf);
            LocalDate date2 = LocalDate.parse(inputString2, dtf);
            return ChronoUnit.DAYS.between(date1, date2);
        } catch (Exception e) {
            return 0;
        }
    }

    public DayOfWeek getDay() {
        LocalDate today = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
        return today.getDayOfWeek(); // как перечисление
    }

    public boolean isLeapYear() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year.getYear());
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }
}
