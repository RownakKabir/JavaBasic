package class7;


    import java.util.HashSet;
import java.util.Set;

    public class SetExample {
        public static void main(String[] args) {
            // Example of a set
            Set<String> vegetables = new HashSet<>();

            // Adding elements to the set
            vegetables.add("carrot");
            vegetables.add("potato");
            vegetables.add("tomato");

            // Adding a duplicate element (ignored in a set)
            vegetables.add("carrot");

            // Iterating through elements
            for (String veggie : vegetables) {
                System.out.println(veggie);
            }


            // Removing an element
            vegetables.remove("potato");
            System.out.println(vegetables);
        }
    }


