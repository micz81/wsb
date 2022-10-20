package zadanie05;

public class Main {

    public static void main(String[] args) {
        UniqueTable table = new UniqueTable();

        table.addItem(-3);
        System.out.println(table.toString());
        table.addItem(65.364);
        System.out.println(table.toString());
        table.addItem(-3);
        System.out.println(table.toString());
        table.addItem(3);
        System.out.println(table.toString());
        table.addItem(0);
        System.out.println(table.toString());
        table.addItem(12.55);
        System.out.println(table.toString());

        table.deleteItem(3);
        System.out.println(table.toString());
        table.deleteItem(123);
        System.out.println(table.toString());
        table.deleteItem(-3.0);
        System.out.println(table.toString());
    }
}
