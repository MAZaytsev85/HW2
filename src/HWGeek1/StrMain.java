package HWGeek1;


import java.util.Scanner;

//Задание №7

public class StrMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = in.nextLine();
        nameMain(name);
    } public static void nameMain(String name) {
        System.out.println("Привет " + name +"!");
    }
}
