package collections;
import java.util.Map;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Key1", "1");
        treeMap.put("Key2", "2");
        treeMap.put("Key3", "3");

        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
