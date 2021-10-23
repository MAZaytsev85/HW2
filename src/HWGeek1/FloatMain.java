package HWGeek1;

// Задание №3

public class FloatMain {
    public static void main(String[] args) {
        FMain(12.23f, 45.67f, 34.8f, 66.668f);
    }

    public static void FMain(float a, float b, float c, float d) {
        float result = (a * (b + (c / d)));
        System.out.println(result);

    }
}

