package dsa.algos.special.collections.queue;
import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    static void main(String[] args) {
        Queue<String> orders = new LinkedList<>();
        orders.add("Order101");
        orders.offer("Order102");
        System.out.println("Orders:" +orders);
        System.out.println("Serving :" +orders.poll());
        System.out.println("Pending Order:" + orders);
        System.out.println(orders.element());

    }
}
