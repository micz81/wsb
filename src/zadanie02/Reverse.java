package zadanie02;

public class Reverse {
    public static String [] reverse(String[] items) {
        String[] reversed = new String[items.length];
        int index = items.length -1;
        for (String el: items) {
            reversed[index] = el;
            index--;
        }
        return reversed;
    }

    public static void print(String[] items) {
        String table = "";
        for (String el: items) {
            table += el + " ";
        }
        System.out.println("Table: " + table);
    }
}
