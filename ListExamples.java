import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> aList = new ArrayList<>();

        // Adding elements to the ArrayList
        aList.add("Apple");
        aList.add("Banana");
        aList.add("Cherry");

        // Accessing an element in the ArrayList by index
        String aFirst = aList.get(0);
        System.out.println("First element in ArrayList: " + aFirst);

        // Removing an element from the ArrayList by index
        aList.remove(1);
        System.out.println("ArrayList after removing element: " + aList);

        // Creating a LinkedList
        List<String> lList = new LinkedList<>();

        // Adding elements to the LinkedList
        lList.add("Dog");
        lList.add("Cat");
        lList.add("Horse");

        // Accessing an element in the LinkedList by index
        String lFirst = lList.get(0);
        System.out.println("First element in LinkedList: " + lFirst);

        // Removing an element from the LinkedList by index
        lList.remove(1);
        System.out.println("LinkedList after removing element: " + lList);
    }
}
