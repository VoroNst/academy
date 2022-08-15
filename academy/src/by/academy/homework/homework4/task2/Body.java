package by.academy.homework.homework4.task2;

/**
 * Задание 2.
 * 1. Создать класс Body.
 * <p>
 * 2. Создать внутренний класс Heart, объект которого создается в конструкторе Body.
 * Реализовать метод live (в классе Heart), в котором вы в цикле пробегаетесь от нуля до Integer.MAX_VALUE
 * и на каждую 100 итерацию выводите на экран "Knock-knock-knockin' on heaven's door".
 * <p>
 * 3. Создать внутренний класс Lungs, объект которого создается в конструкторе Body.
 * Реализовать метод live (в классе Lungs), в котором вы в цикле пробегаетесь от нуля до Integer.MAX_VALUE
 * и на каждую 50 итерацию выводите на экран "breathe in", а на каждую 100 - "breathe out".
 * <p>
 * 4. Реализовать метод live в классе Body, в котором мы запускаем метод live на объекте lungs (lungs.live())
 * и метод live на объекте heart (heart.live()).
 * После отработки обоих методов выведем на экран:
 * "You stand on the shore and feel the salty smell of the wind that blows from the sea.
 * And I believe that you are free, and life has only begun.".
 */
public class Body {

    private int a = Integer.MAX_VALUE;
    private Heart heart;
    private Lungs lungs;



//    public Body() {
//        Heart heart = new Heart();
//        Lungs lungs = new Lungs();
//    }

    public  Body() {
        this.a = a;
        heart = new Heart();
        lungs = new Lungs();

    }

    public void live() {
        heart.live();
        lungs.live();
        System.out.println("You stand on the shore and feel the salty smell of the wind that blows from the sea. " +
                "And I believe that you are free, and life has only begun.");
    }

    class Heart {
        void live() {
            for (int i = 0; i < a; i++) {
                if (i % 100 == 0) {
                    System.out.println("Knock-knock-knockin' on heaven's door");
                }
            }
        }
    }

    class Lungs {
        public void live() {
            for (int i = 0; i < a; i++) {
                if (i % 50 == 0 && i % 100 !=0) {

                    System.out.println("breathe in");
                }
                if (i % 100 == 0) {
                    System.out.println("breathe out");
                }
            }
        }
    }
}








