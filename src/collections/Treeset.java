package collections;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Dog");
        treeSet.add("Cat");
        treeSet.add("Elephant");

        for (String animal : treeSet) {
            System.out.println(animal);
        }
    }
}
