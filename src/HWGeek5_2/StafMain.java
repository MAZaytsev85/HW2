package HWGeek5_2;


public class StafMain {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Dmitry", "Director", "dmitry@gmail.com", "89653435564", 30000, 67);
        worker1.WorkerPrint();

        Worker[] workArray = new Worker[5];
        workArray[0] = new Worker("Dmitry", "Director", "dmitry@gmail.com", "89653435564", 30000, 67);
        workArray[1] = new Worker("Ivan", "Master", "Ivan@ya.ru", "89223334456", 30000, 43);
        workArray[2] = new Worker("Sergey", "Technical", "Sergey@ya.ru", "89223334457", 20000, 41);
        workArray[3] = new Worker("Evgeny", "Technical", "Evgeny@ya.ru", "89223334458", 20000, 33);
        workArray[4] = new Worker("Alexey", "Technical", "Alexey@ya.ru", "89223334459", 20000, 32);
        for (Worker workArr : workArray) {
            if (workArr.getYear() > 40) workArr.WorkerPrint();
        }
    }

}