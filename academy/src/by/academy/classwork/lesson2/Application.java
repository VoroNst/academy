package by.academy.classwork.lesson2;

public class Application {

    public static <String> void main(String[] args) {

        Cat Cat1 = new Cat();
        Cat Cat2 = new Cat("Рыжий");

        Cat2.eat();
        Cat2.sleep();
        Cat2.walc();

        Cat1.grow();
        Cat1.grow();
        Cat1.grow();
        System.out.println(Cat1.age);

    }

}


