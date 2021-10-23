package HWGeek1;

import java.util.Scanner;

// Задание №6

public class BoolMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int val = in.nextInt();
        boolean a = boolMain(val);
        System.out.println(a);
    }

    public static boolean boolMain(int val) {
        return val < 0;
    }
}

