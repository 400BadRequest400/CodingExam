package string.problems;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String reverse = ""; // Objects of String class

        String word = "MADAM";

        //char a = word.charAt(0); The pricipe of using word.charAt(i)
        //System.out.println(a);

        int length = word.length();

        for (int i = length-1 ; i >= 0; i--) {
            System.out.println(reverse);// to print the word in the opposite way

            reverse = reverse + word.charAt(i);}

            if (word.equals(reverse))
                System.out.println("The string is a palindrome.");
            else
                System.out.println("The string isn't a palindrome.");


    }
}

