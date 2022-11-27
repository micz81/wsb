package zadanie09;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] table = {1, 5, 2, 6, 34, 2, 6, 23, 354, -2, 0};
        System.out.println(Arrays.toString(table));
        selectionSort(table);
        System.out.println(Arrays.toString(table));
    }

    public static void selectionSort(int[] items) {
        for (int i = 0 ; i < items.length - 2 ; i ++) {
            for (int k = 0 ; k < items.length - 1 ; k++) {
                int smallestIndex = k;
                if (items[smallestIndex] > items[smallestIndex + 1]) {
                    smallestIndex = smallestIndex + 1;
                }
                if (smallestIndex != k) {
                    int helper = items[k];
                    items[k] = items[smallestIndex];
                    items[smallestIndex] = helper;
                }
            }
        }
    }
}
