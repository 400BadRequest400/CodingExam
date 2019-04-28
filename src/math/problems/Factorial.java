package math.problems;

public class Factorial {

    //1- Iteration
    public static int iterationFactorial(int a) {

        int number = 1;

        for (int i = 2; i < 6; i++) {
            number = number * i;
        }

        return number;
    }

    //2- Recursion
    public static int recursionFactorial(int a) {
        if (a == 0) return 1;
        return a * recursionFactorial((a - 1));
    }


    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int a = 5;

        System.out.println("the factorial of 5 is :" + iterationFactorial(a));
        System.out.println("the factorial of 5 is :" + recursionFactorial(a));


    }


}




