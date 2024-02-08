package collections;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);

        for (Integer number : hashSet) {
            System.out.println(number);
        }
    }
}