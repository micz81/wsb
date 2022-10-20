package zadanie04;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        DynamicTable table = new DynamicTable();

        table.addItem(0.001);
        System.out.println(table.toString());
        table.addItem(1.365);
        System.out.println(table.toString());
        table.addItem(5);
        System.out.println(table.toString());

        table.deleteItem(1);
        System.out.println(table.toString());
        table.deleteItem(-1);
        System.out.println(table.toString());
        table.deleteItem(8);
        System.out.println(table.toString());
        table.addItem(10.11);
        System.out.println(table.toString());
        table.addItem(365.9473);
        System.out.println(table.toString());
        table.deleteItem(0);
        System.out.println(table.toString());
    }
}
