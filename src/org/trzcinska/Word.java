package org.trzcinska;

import java.util.HashMap;



public class Word {
    public HashMap<String, Integer> countWords(String text) {
        //String lowerText = text.toLowerCase();
        String withoutDots = text.replace("."," ");
        String withoutComma = withoutDots.replace(","," ");
        String withoutDoubleSpace = withoutComma.replace(";"," ");
        String fixedText = withoutDoubleSpace.replace("  "," ");


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

