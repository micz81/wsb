package zadanie05;

public class UniqueTable {
    private double[] table = new double[0];

    public void addItem(double item) {
        double[] newTable = new double[table.length + 1];
        int index = 0;

        for (double el: table) {
            if (el == item) {
                return;
            } else {
                newTable[index] = el;
                index++;
            }
        }
        newTable[index] = item;
        table = newTable;
    }

    public void deleteItem(double itemToDelete) {
        double[] newTable = new double[table.length - 1];
        boolean containsFlag = false;

        for (double el: table) {
            if (el == itemToDelete) {
                containsFlag = true;
            }
        }

        if (containsFlag) {
            int index = 0;

            for (double el: table) {
                if (el != itemToDelete) {
                    newTable[index] = el;
                    index++;
                }
            }
            table = newTable;
        }
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
