package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Queue<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Horse");


        System.out.println("peek : "+animals.peek());
        System.out.println("remove : "+animals.remove());
        System.out.println("poll : "+animals.poll());

        //pool the elements
        for(String x : animals ){
            System.out.println("for loop : "+x);
        }


        //while loop with Iterator to retrieve data.
        Iterator it = animals.iterator();
        while(it.hasNext()){
            System.out.println("Iterator : "+it.next());
        }



    }

}
