package datastructure;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class DataReader {

    public static void main(String[] args) {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";


        FileReader fileReader =null;
        BufferedReader bufferedReaderfile = null;

        try {
            fileReader = new FileReader("/Users/djafarouldslimane/IdeaProjects/CodingExam/src/data/self-driving-car");
            bufferedReaderfile =new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            while ((textFile = bufferedReaderfile.readLine())!=null){
                System.out.println(textFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                fileReader = null;
            }
            if (bufferedReaderfile != null) {
                bufferedReaderfile = null;
            }
        }


        System.out.println("*********************");


        Stack stack = new Stack();

        stack.push("Usa");
        stack.push("Canada");
        stack.push("Algeria");
        stack.push("Germany");
        stack.push("Bangladesh");

        System.out.println(stack);
        for (Object str:stack){
            System.out.println(str+" :Name of the Contriy");
        }
        System.out.println("===================");

        stack.pop();
        stack.pop();
        System.out.println(stack);

        System.out.println("===================");
        System.out.println(stack.peek());

        System.out.println("===================");
        System.out.println(stack.search("Canada"));//position of the object

        System.out.println("===================");
        System.out.println(stack.indexOf("Canada"));//index of the object



    }

}