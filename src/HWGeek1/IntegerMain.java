package HWGeek1;

import java.util.Scanner;

// Задание №4

public class IntegerMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
    integerMain(a, b);

    } public static void integerMain(int a, int b) {
        int sum = a + b;
        boolean result = sum >= 10 && sum <= 20; {
            System.out.println(result);
        }

    }
}
