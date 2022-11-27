package zadanie12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        while (true) {
            System.out.println("Enter word: ");
            String word = sc.next();
            if (word.equals("q")) {
                break;
            }
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }

}
