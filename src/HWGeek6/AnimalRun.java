package HWGeek6;

public class AnimalRun {

    public static void main(String[] args) {

        Dog dog = new Dog("Bobik", 400, 20);
        Cat cat = new Cat("Barsik", 150);
        Dog dog2 = new Dog("Sharik", 300, 9);

        dog.run();
        dog.swim();
        dog2.run();
        dog2.swim();
        cat.run();

        System.out.println(Animal.getAnimalCount());

    }
}
