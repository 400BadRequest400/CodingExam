package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

    public static void main(String[] args) {
        /*
         * Write java solution to find the lowest number from this array.
         * Use one of the databases from mysql or mongodb to store and to retrieve.
         */
        int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        System.out.println("Smallest: " + getSmallest(array, array.length));

        //find lowest number from the array

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> getSmallest = new ArrayList<String>();
        try {
            connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_getSmallest", "column_getSmallest");
            getSmallest = connectToSqlDB.readDataBase("tbl_getSmallest", "column_getSmallest");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
        for (String st : getSmallest) {
            System.out.println(st);
        }
    }

    public static int getSmallest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];
    }


}
