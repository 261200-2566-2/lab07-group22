import java.util.Set;

public class LAB07 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        System.out.println("Adding");
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

        System.out.println("size: " + set.size());
        System.out.println("contains 'B': " + set.contains("B"));
        System.out.println("contains 'D': " + set.contains("D"));

        System.out.println("Removing");
        set.remove("B");
        System.out.println("Set size after removal: " + set.size());
        System.out.println("contains 'B' " + set.contains("B"));

        System.out.println("Adding a collection of elements to the set ");
        Set<String> otherSet = Set.of("C", "D", "E","F");
        set.addAll(otherSet);
        System.out.println("Size after add: " + set.size());

        System.out.println("Removing elements present in another collection:");
        Set<String> removeSet = Set.of("C", "E");
        set.removeAll(removeSet);
        System.out.println("Size after remove: " + set.size());

        System.out.println("Clearing");
        set.clear();
        System.out.println("Size after clear: " + set.size());;
    }
}
