package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        int i = 0;

        while (i>=0){

            if (i>30){
                System.out.println(i);
                break; //stops once it is greater than 30
            }
            i+=1;
        }
    }
}
