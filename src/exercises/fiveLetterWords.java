package exercises;

import java.util.ArrayList;

public class fiveLetterWords {
    public static void main(String[] args) {
        String k[] = {"Kubenetics", "k8s", "udacity", "launchcode", "seven"};
        ArrayList<String> wordlist = new ArrayList<String>(k.length);
        for (String word : k) {
            wordlist.add(word);
        }
        printFives(wordlist);
    }

    public static void printFives(ArrayList<String> wordList) {
        for (String word: wordList) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }

    }
}
