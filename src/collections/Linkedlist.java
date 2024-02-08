package collections;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
    }
}
