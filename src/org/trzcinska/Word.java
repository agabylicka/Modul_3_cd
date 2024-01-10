package org.trzcinska;

import java.util.HashMap;
import java.util.Locale;
import java.util.Set;

// 3. Liczenie słów w tekście: Napisz metodę, która przyjmując String, zwróci HashMapę, w której
// kluczem jest słowo,a wartością ilość wystąpień w tekście:
//a. public HashMap<String, Integer> countWords(String text)

public class Word {
    public HashMap<String, Integer> countWords(String text) {
        String lowerText = text.toLowerCase();
        String withoutDots = lowerText.replace("."," ");
        String withoutComma = withoutDots.replace(","," ");
        String fixedText = withoutComma.replace(";"," ");

        String[] words = fixedText.split(" ");
        HashMap<String, Integer> countWords = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String key = words[i];
            if (countWords.containsKey(key)) {
                int count = countWords.get(key);
                count++;
                countWords.put(key, count);
            } else {
                int count = 1;
                countWords.put(key, count);
            }

        }
        return countWords;
    }
}

