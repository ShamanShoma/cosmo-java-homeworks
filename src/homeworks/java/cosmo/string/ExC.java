package homeworks.java.cosmo.string;

import java.util.Arrays;

/**
 * Напишите программу,
 * которая на вход получает строку “Мама мыла Милу мылом!” и выводит количество слов в ней.
 * “Мама мыла Милу мылом!” -> 4
 * <p>
 * Подсказка: используйте метод .split() класса String
 */
public class ExC {
    public static void main(String[] args) {
        String input = "Мама мыла Милу мылом!";
        String[] word = input.split(" ");
        int count = 0;

//        for (String i : word) {
//            count +=1;
//        }

        while (count < word.length) {
            count += 1;
        }

        System.out.println(count);

    }
}