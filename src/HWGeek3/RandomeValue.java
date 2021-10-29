package HWGeek3;

import java.util.Scanner;

public class RandomeValue {

    public static void main(String[] args) {

        randomeProg();
    }

    public static void randomeProg() {
        Scanner scan = new Scanner(System.in);
        double x = (Math.random() * 8 + 1);
        int g = (int) x;
       // System.out.println(g);
        int count = 1;
        System.out.println("Попытка " + count + " введите число");

        for (int i = 0; i < 3; i++) {
            int rezult = scan.nextInt();

            count++;

            if (rezult == g) {
                System.out.println("Вы угадали");
                break;
            } else if (rezult > g) {
                System.out.println("Число больше загаданного");
            } else {
                System.out.println("Число меньше загаданного");

            }
            System.out.println("Попытка " + count + " введите число");
        }
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int quest = scan.nextInt();
        if (quest == 1) {
            randomeProg();
        }

    }
}
