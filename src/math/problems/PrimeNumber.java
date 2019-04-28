package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */
            int low = 2;
            int high = 1000000;

            while (low < high) {
                boolean number = false;

                for(int i = 2; i <= low/2; ++i) {
                    // condition for nonprime number
                    if(low % i == 0) {
                        number = true;
                        break;
                    }
                }

                if (!number)
                    System.out.print(low + " ");

                ++low;
            }
        }




    }


