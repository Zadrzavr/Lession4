package lession4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Hello", "Car", "Witcher", "Cat", "Dog", "God","Angels", "USA", "Box", "Riven"};

        HashMap<String, Integer> Words = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if (Words.containsKey(words[i])) {
                Words.put(words[i], Words.get(words[i]) + i);
            } else {
                Words.put(words[i], 1);
            }
        }

        System.out.println(Words);
    }
}
