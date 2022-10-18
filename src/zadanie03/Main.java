package zadanie03;

public class Main {

    public static void main(String[] args) {
        int[] table = {-7, 0, -6};
        System.out.println(max(table));
    }

    public static int max(int[] items) {
        if (items.length == 0) {
            return 0;
        } else {
            int max = items[0];
            for (int i: items) {
                if (i > max) {
                    max =i;
                }
            }
            return max;
        }
    }
}
