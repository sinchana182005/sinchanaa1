package dsa.algos.special.collections.sets;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class MaintainInsertionOrder {
    static void main(String[] args) {
        HashSet<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(21);
        set.add(31);
        System.out.println(set);
    }
}
