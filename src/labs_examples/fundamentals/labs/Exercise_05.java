package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int x=str.length();
        System.out.println("length of first string is" + x);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        int y=str2.length();
        System.out.println("length of second string is" + y);
        boolean samelength= x==y;
        System.out.println("are they the same lengths?" +samelength);


        // please concatenate str & str2 and set the result to a new String variable below
        String newstr = str+str2;
        System.out.println(newstr);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        String str3= str.replace("!","o");
        System.out.println(str3);

    }


}