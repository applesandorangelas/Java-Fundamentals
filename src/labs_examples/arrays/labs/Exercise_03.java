package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int [][] newArray = new int [5][5];
        int val = 0;
        for (int i=0;i<newArray.length;i+=1){
            for (int j=0; j<newArray[i].length;j+=1){
                newArray[i][j]=val+=3;
                System.out.print(newArray[i][j] + " ");
            }
            System.out.print('\n');
        }


    }
}
