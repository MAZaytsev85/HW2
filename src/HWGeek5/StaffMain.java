package HWGeek5;

public class StaffMain {
    public static void main(String[] args) {
        Person Person1 = new Person("Boris", "Manager", "Boris@ya.ru", "89223334455", 50000, 45);
        Person1.ConsoleOut();


        Person[] persArray = {
                new Person("Boris", "Manager", "Boris@ya.ru", "89223334455", 50000, 45),
                new Person("Ivan", "Master", "Ivan@ya.ru", "89223334456", 30000, 43),
                new Person("Sergey", "Technical", "Sergey@ya.ru", "89223334457", 20000, 35),
                new Person("Evgeny", "Technical", "Evgeny@ya.ru", "89223334458", 20000, 33),
                new Person("Alexey", "Technical", "Alexey@ya.ru", "89223334459", 20000, 32),

    };
         for (Person persArr : persArray) {
             if (persArr.getYear() > 40) persArr.ConsoleOut();

        }
    }
}

