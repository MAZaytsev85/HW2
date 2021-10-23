package HWGeek1;

import java.util.Scanner;

//Задание №8

public class YearMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год");
        int year = in.nextInt();
        yearMain(year);
    }
    public static void yearMain(int year) {
        int a = year % 4; //Делится нацело на 4 - Високосный
        int b = year % 100; //Делится нацело на 100 - Не високосный
        int c = year % 400; //Делится нацело на 400 Високосный
        if (a == 0 && b != 0 || c == 0) {
            System.out.println("Год високосный");
        } else
            System.out.println("Год не високосный");
    }

    }
