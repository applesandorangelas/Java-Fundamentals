package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        System.out.println("Let pi=3.14");
        System.out.println("Height and radius are given. h=5 and r=3.14");
        double pi=3.14;
        int h=5;
        double r=3.14*1d;
        double volume = pi*r*r*h*1d;
        double surfaceArea = 2*pi*r*h*1d+ pi*r*r + pi*r*r;
        System.out.println("The volume of the cylinder is "+volume);
        System.out.println("The surface area of the cylinder is " +surfaceArea);

    }
}