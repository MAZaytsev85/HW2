package HWGeek6;

public class AnimalRun {

    public static void main(String[] args) {

        Dog dog = new Dog("Bobik", 400, 20);
        Cat cat = new Cat("Barsik", 150);

        dog.run();
        dog.swim();
        cat.run();
    }
}
