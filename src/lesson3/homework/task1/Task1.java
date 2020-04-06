package src.lesson3.homework.task1;

// https://javarush.ru/groups/posts/524-khvatit-pisatjh-ciklih-top-10-luchshikh-metodov-dlja-rabotih-s-kollekcijami-iz-java8

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {

    private static final String[] fruits = {
            "apple", "banana", "papaya",
            "banana", "banana", "banana",
            "carrot", "carrot", "pear",
            "kiwi", "papaya", "broccoli",
            "potato", "potato", "pear",
            "fruit", "orange", "kiwi",
            "papaya", "papaya", "papaya",
    };


    public static void main(String[] args) {
        Map<String, Integer> wordRepeats = new LinkedHashMap<>();
        for (String word : fruits) {
            wordRepeats.merge(word, 1, Integer::sum);
        }


        wordRepeats.forEach((word, frequency) -> System.out.println(word + ": " + frequency));
    }
}

