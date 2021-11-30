package HWGeek10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.TreeSet;

public class WordsList {

    public static final String words =

            "Tonight my head is bowed in sorrow " +
    "I can't keep the tears from my eyes " +
    "My son calls another man daddy " +
    "The right to his love I've been denied " +
    "My son calls another man daddy " +
    "He'll never know my name nor my face " +
    "God only knows, how it hurts me " +
    "For another to be in my place ";

    private static TreeSet<String> getWords(String[] arr) {
        return new TreeSet<>(Arrays.asList(arr));
    }
    private static HashMap<String, Integer> getWordsCount(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.merge(s, 1, Integer :: sum);
        }
        return map;
}

    public static void main(String[] args) {
        System.out.println(getWords(words.toLowerCase().split(" ")));
        System.out.println(getWordsCount(words.toLowerCase().split(" ")));

        PhoneBook phonebook = new PhoneBook();
        phonebook.add("Kovalchuk", "89244774477");
        phonebook.add("Kozlov", "89238884477");
        phonebook.add("Sobol", "89258946633");
        phonebook.add("Efremov", "89205633302");
        phonebook.add("Kovalchuk", "89059937610");

        System.out.println("phone Kovalchuk: " + phonebook.get("Kovalchuk"));
        System.out.println("phone Kozlov: " + phonebook.get("Kozlov"));
        System.out.println("phone Sobol: " + phonebook.get("Sobol"));
        System.out.println("phone Efremov: " + phonebook.get("Efremov"));
    }
}



