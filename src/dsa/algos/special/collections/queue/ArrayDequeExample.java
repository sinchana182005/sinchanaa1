package dsa.algos.special.collections.queue;
import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayDequeExample {
    static void main(String[] args) {
        Deque<String> actions = new ArrayDeque<>();
        actions.addLast("User Types A");
        actions.addLast("User Types B");
        actions.addLast("User Deletes B");
        System.out.println("Undo :" + actions.removeLast());
        System.out.println("Remaining actions:" + actions);
    }
}
