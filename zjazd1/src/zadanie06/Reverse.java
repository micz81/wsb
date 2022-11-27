package zadanie06;

import java.util.Arrays;

public class Reverse {

    public static void reverse(int[] items) {

        for (int i = 0 ; i < items.length / 2 ; i++) {
            int helper = items[i];
            items[i] = items[items.length - i - 1];
            items[items.length - i - 1] = helper;
        }
    }

    public static void main(String[] args) {
        int[] table = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(table));
        reverse(table);
        System.out.println(Arrays.toString(table));
    }
}


