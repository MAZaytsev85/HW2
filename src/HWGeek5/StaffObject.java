package HWGeek5;

    class Person {

        String name;
        String position;
        String mail;
        String phone;
        int cash;
        int year;
        Person[] persArray = new Person[5];


        void ConsoleOut() {
            System.out.println(name + " " + position + " " + phone + " " + mail + " " + cash + " " + year);
        }

        public Person(String name1, String position1, String mail1, String phone1, int cash1, int year1) {
            name = name1;
            position = position1;
            mail = mail1;
            phone = phone1;
            cash = cash1;
            year = year1;
        }

        void ArrayOut() {
            persArray[0] = new Person("Boris", "Manager", "Boris@ya.ru", "89223334455", 50000, 45);
            persArray[1] = new Person("Ivan", "Master", "Ivan@ya.ru", "89223334456", 30000, 43);
            persArray[2] = new Person("Sergey", "Technical", "Sergey@ya.ru", "89223334457", 20000, 35);
            persArray[3] = new Person("Evgeny", "Technical", "Evgeny@ya.ru", "89223334458", 20000, 33);
            persArray[4] = new Person("Alexey", "Technical", "Alexey@ya.ru", "89223334459", 20000, 32);
            for (int i = 0; i < persArray.length && year > 40; i++) {
                System.out.println(persArray[i]);
            }

        }
    }