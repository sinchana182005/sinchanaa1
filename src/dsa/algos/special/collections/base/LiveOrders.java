package dsa.algos.special.collections.base;
import java.util.ArrayList;
import java.util.Collection;
public class LiveOrders {
    static void main(String[] args) {
        Collection<String> liveOrders = new ArrayList<>();
        //new orders are added
        liveOrders.add("ORD101");
        liveOrders.add("ORD102");
        liveOrders.add("ORD103");
        //check order
        System.out.println("ORD103 exists?"+liveOrders.contains("ORD103"));//?=gives true or false
        //check the live orders
        //liveOrders.remove("ORD102");this will remove a particular order
        System.out.println("Live Orders:"+liveOrders);
        liveOrders.clear();//clears all the orders
        System.out.println("Orders after closing:"+liveOrders);

    }
}
