package datastructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "WashingtonDC");

        System.out.println(capitalCities);

        //Access an Item
        capitalCities.get("England");
        System.out.println(capitalCities.get("England"));

        //Remove an Item
        capitalCities.remove("England");
        System.out.println(capitalCities);

        //To remove all items, use the clear() method:
        //capitalCities.clear();
        //System.out.println(capitalCities);

        //HashMap Size
        capitalCities.size();
        System.out.println(capitalCities.size());

        //Loop Through a HashMap
        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Print values
        for (String i : capitalCities.values()) {
            System.out.print(i + "  ");
        }
        System.out.println();


        // Create a HashMap object called people
        Map<String, Integer> people = new LinkedHashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }




    }

}
