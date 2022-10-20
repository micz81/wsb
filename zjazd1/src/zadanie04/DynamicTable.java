package zadanie04;

public class DynamicTable {
    private static double[] table = new double[0];

    public void addItem(double item) {
        double[] newTable = new double[table.length + 1];

        int index = 0;
        for (double el: table) {
            newTable[index] = el;
            index++;
        }
        newTable[newTable.length - 1] = item;
        table = newTable;
    }

    public void deleteItem(int indexToDetlete) {
        if (indexToDetlete < 0 || indexToDetlete > table.length - 1) {
            return;
        }

        double[] newTable = new double[table.length - 1];
        int newIndex = 0;
        int oldIndex = 0;
        for (double el: table) {
            if (oldIndex != indexToDetlete) {
                newTable[newIndex] = el;
                newIndex++;
            }
            oldIndex++;
        }
        table = newTable;
    }

    public String toString() {
        String str = "";
        boolean addComma = false;
        for (double el: table) {
            if (addComma) {
                str += ", ";
            }
            str += el;
            addComma = true;
        }
        return str;
    }
}
