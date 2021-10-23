package HWGeek1;

import java.util.Scanner;

// Задание №5

public class PositiveNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int value = in.nextInt();
        positiveMain(value);
    }

    public static void positiveMain(int value) {
        if (value >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}

