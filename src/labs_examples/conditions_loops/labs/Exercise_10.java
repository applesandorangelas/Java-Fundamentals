package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        int i = 0;
        while (i<20){
            i+=1;
            if (i%2==0){
                continue;
            }
            System.out.println(i); //prints all odd numbers
        }
    }
}
