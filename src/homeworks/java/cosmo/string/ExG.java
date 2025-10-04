package homeworks.java.cosmo.string;

import java.util.Arrays;

import static java.lang.String.valueOf;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>
   Подсказка: используйте методы .split(), .trim(), .replace() и .replaceFirst() класса String
 */
public class ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";
        // Разбиваем строку на слова
        String[] inputSplit = input.split(" ");

        // Меняем порядок слов на обратный и добавляем пробелы между словами
        StringBuilder reversInput = new StringBuilder();
        for (int i = inputSplit.length - 1; i >= 0; i--) {
            reversInput.append(inputSplit[i]).append(" ");

        }

        String result = reversInput.toString()
                .trim()
                .toLowerCase()
                .replaceFirst("д", "Д")
                .replace("?", "")
                + "?";

        System.out.println(result);
    }
}