package dsa.algos.special.collections.maps;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
    static void main(String[] args) {
        Hashtable<Integer,String>ht =new Hashtable<>();
        ht.put(106,"Surabhi");
        ht.put(117,"Siri");
        ht.put(128,"Sushma");
        ht.put(100,"Bhumikha");
        ht.put(99,"Janavi");
        ht.put(101,"Janani");
        // ht.put(null,"Chinnu");//No null keys allowed in HashTable,null values can be passed
        for(Map.Entry<Integer,String>entry:ht.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        String str="Java";
        System.out.println(str.hashCode());//assigns a unique hashcode and segregates it
        //ht.remove(98);
    }
}

