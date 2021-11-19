package HWGeek8;

import HWGeek6.Dog;

public class PersonsMove {
    public static void main(String[] args) {

        Move[] moving = {
                new Man("Boris", 2000, 20),
                new Cat("Barsik",200, 50),
                new Robot("Tolik", 20, 5)


        };
        for (Move move : moving) {
            move.run();
            move.jump();

        }
    }
}
