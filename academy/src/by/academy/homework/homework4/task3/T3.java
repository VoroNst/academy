package by.academy.homework.homework4.task3;

import java.util.Arrays;
import java.util.Objects;

/**
 * Задание 3.
 * Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.
 * Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
 * Содержит конструктор, принимающий значение int и инитает им размер нашего массива.
 * <p>
 * Содержит методы:
 * 1) добавления в наш массив объекта типа T - add(T obj) (нужно помнить,
 * что если массив заполнен, нам нужно его расширить с помощью Arrays.copyOf)
 * 2) взятие по индексу get(int i)
 * 3) взятие последнего элемента getLast()
 * 4) взятие первого элемента getFirst()
 * 5) вывод размера массива
 * 6) вывод индекса последнего заполненого элемента (не путать с размерностью)
 * 7) удаление элемента по индексу (remove(int i)
 * 8) удаление элемента по значению (remove(T obj))
 */
public class T3<T> {
    private T[] array;
//

    private int index;
    private int size;

    public T3(int size) {
        this.size = size;
        this.array = (T[]) array[size];
    }

    public T3() {
        super();
        this.array = (T[]) new Object[16];
    }

    public T getStart() {
        return (T) array[0];
    }

    public T getEnd() {
        return (T) array[array.length - 1];
    }

    public void add(T obj) {

        if (index == array.length) {

            int newLength = (int) (array.length == 0 ? 1 : array.length * 1.5);
            T[] newArr = Arrays.copyOf(array, newLength);
            newArr[array.length] = obj;
            array = newArr;
        } else {
            array[index++] = obj;

        }
    }

    public T getByIndex(int i) {
        return (T) array[i];

    }

    public int showCapacity() {
        return array.length;
    }

    public void remove(int i) {
        array[i] = null;
        for (int j = i; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
    }

    public void removeValue(T obj) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == obj) {
                remove(i);
                break;
            } else {
                System.out.println("Нет такого значения: " + obj);
                break;
            }
        }

    }


    public int findIndex() {
        int i = 0;
        while ((i < array.length) && (array[i] != null)) {
            i++;
        }
        return --i;
    }

    @Override
    public String toString() {
        return "Task3 arr=" + Arrays.toString(array) + ", size=" + size;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.deepHashCode(array);
        result = prime * result + Objects.hash(size);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        T3 other = (T3) obj;
        return Arrays.deepEquals(array, other.array) && size == other.size;
    }

}