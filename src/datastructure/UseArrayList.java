package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<String> players = new ArrayList<String>();
        players.add("MESSI");
        players.add("RONALDO");
        players.add("HAZARD");
        players.add("ZIDANE");
        players.add("FIGO");

        System.out.println("NAMES OF THE PLAYERS = " + players);

        for (int a = 1; a < 3; a++) {
            System.out.println("specified from index to index = " + players.get(a));
        }

        players.remove(2);//is removing the string from the index 2 = HAZARD
            System.out.println("NAMES OF THE PLAYERS = " + players);

        System.out.println("The Index of Zidane is: "+players.indexOf("ZIDANE"));

        players.remove(1);
        System.out.println(players);
        System.out.println("++++++++++++++++");


        //Iterator

        Iterator iterator = players.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println("*******************");


        System.out.println(iterator.hasNext());
        players.add("Mahrez");
        System.out.println(iterator.hasNext());











    }}

