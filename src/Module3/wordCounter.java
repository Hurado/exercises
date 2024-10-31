package Module3;

import java.util.HashMap;

public class wordCounter {
    public HashMap<String, Integer> countWords(String text){

        HashMap<String, Integer> wordsCount = new HashMap<>();


        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z\\s]", "").split("\\s+");
        for(String word : words){
            if(!wordsCount.containsKey(word)){
                wordsCount.put(word, 1);
            } else {
                wordsCount.put(word, wordsCount.get(word) + 1);
            }
        }
        return wordsCount;
    }
}
