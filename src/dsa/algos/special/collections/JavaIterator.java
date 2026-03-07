package dsa.algos.special.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class JavaIterator {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(23);
        list.add(34);
        list.add(5);
        list.add(89);
        Iterator<Integer> it = list.iterator();
        // remove elements greater than 10
        while(it.hasNext()) {
            Integer i = it.next();
            if (i > 10) {
                it.remove();
            }
        }
        System.out.println(list);
            }
        }


