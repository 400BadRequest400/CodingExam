package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String word1 = "LISTEN";
        String word2 = "SILENT";

        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();


        Arrays.sort(array1);
        Arrays.sort(array2);
        if (Arrays.equals(array1, array2)) {
            System.out.println("The Words are Anangram");

        } else {
            System.out.println("The Words are not Anangram");

        }
    }
}
