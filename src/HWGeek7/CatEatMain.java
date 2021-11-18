package HWGeek7;

public class CatEatMain {
    public static void main (String [] args) {

        Cat[] cats = {
                new Cat("Barsik", 50),
                new Cat("Murzik", 20),
                new Cat("Murka", 500),

        };
        Bowl bowl = new Bowl();
        bowl.putFood(500);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
