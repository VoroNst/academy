package by.academy.homework.homework4.task3;

public class T3_Test {


    public static void main(String[] args) {
        T3<Integer> array = new T3<>();

        array.add(77);
        array.add(22);
        array.add(12);
        array.add(5);
        array.add(6);
        array.add(28);
        array.add(35);
        System.out.println("Размер массива: " + array.showCapacity());
        System.out.println("Start  : " + array.getStart());
        System.out.println("End  : " + array.getEnd());

        System.out.println(array.getByIndex(4));

        array.remove(3);
        System.out.println(array);
        System.out.println("Последний элемент. Индекс: " + array.findIndex());

        array.removeValue(11);
        array.removeValue(5);

        System.out.println(array);

    }
}