package dsa.algos.special.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveUsingLambda {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(23);
        list.add(34);
        list.add(5);
        list.add(89);
        Iterator<Integer> it = list.iterator();
        // remove elements greater than 10
        System.out.println("Before:" +list);
        list.removeIf(n -> n%2==0);
        System.out.println("After:" +list);
        list.removeIf(n->n %2==0 );
        System.out.println("After :" +list);
            }
        }


