package labs_examples.arrays.labs;


import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("tub");
        myArrayList.add("cub");
        myArrayList.add("rub");
        myArrayList.add("fub");
        myArrayList.add("hub");
        myArrayList.add("dub");

        String indexThreeVal = myArrayList.get(3);
        System.out.println(indexThreeVal);

        myArrayList.remove("tub");
        System.out.println(myArrayList);
        System.out.println(myArrayList.get(1));
    }
}