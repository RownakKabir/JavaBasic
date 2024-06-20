package class7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Example of a list
        List<String> fruits = new ArrayList<>();

        // Adding elements to the list
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        // Accessing elements
        System.out.println(fruits.get(0));  // Output: apple

        // Modifying elements
        fruits.set(1, "blackberry");
        System.out.println(fruits);  // Output: [apple, blackberry, cherry]


        // Removing elements
        fruits.remove(2);
        System.out.println(fruits);

        List<String> fruits1 = Arrays.asList("Mango","Strawberry");
       fruits.addAll(0, fruits1);

        for (String a : fruits) {
            System.out.println(a);

        }

    }
}
