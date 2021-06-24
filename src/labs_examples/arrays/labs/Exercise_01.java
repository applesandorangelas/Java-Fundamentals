package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please input ten numbers. Press enter after each number.");
        int[] tenNumbers = new int [10];
                tenNumbers[0] = myScanner.nextInt();
                tenNumbers[1] = myScanner.nextInt();
                tenNumbers[2] = myScanner.nextInt();
                tenNumbers[3] = myScanner.nextInt();
                tenNumbers[4] = myScanner.nextInt();
                tenNumbers[5] = myScanner.nextInt();
                tenNumbers[6] = myScanner.nextInt();
                tenNumbers[7] = myScanner.nextInt();
                tenNumbers[8] = myScanner.nextInt();
                tenNumbers[9] = myScanner.nextInt();
int sum = 0;
                for (int i=0; i< tenNumbers.length; i+=1){
                    sum = sum + tenNumbers[i];

                    if (i== tenNumbers.length-1){
                        double average = sum/10d;
                        System.out.println("The sum is " + sum);
                        System.out.println("The average is " + average);
                    }
                }

        //System.out.println(tenNumbers);

    }
}