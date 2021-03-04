package _10_dsa_stack_queue.exercises.exercise_3;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        String str = "anh di anh nho que nha nho canh rau ma nho ca dam tuong";
        String tempStr = str.toLowerCase();
        Map<String, Integer> wordMap = new TreeMap<>();
        String wordArray[] = tempStr.split(" ");
        for (int i = 0; i < wordArray.length; i++) {
            for (String key : wordMap.keySet()) {
                if (key.equals(wordArray[i])) {
                    wordMap.replace(key, wordMap.get(key).intValue() + 1);
                }
            }
            wordMap.putIfAbsent(wordArray[i], 1);
        }
        System.out.println(wordMap);
    }
}
