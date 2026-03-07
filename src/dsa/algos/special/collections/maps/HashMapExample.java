package dsa.algos.special.collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    static void main(String[] args) {
        Map<String, String>hashmap = new HashMap<>();
        //the values means can be same but variable storing it cant be same
        hashmap.put("01","2222");
        hashmap.put("03","1111");
        hashmap.put("1111","3333");
        for(Map.Entry<String,String> entry : hashmap.entrySet()){
            System.out.println(entry.getKey() + ","+entry.getValue());

        }
        Map<String, String>hashmap1 = new LinkedHashMap<>();
        //the values means can be same but variable storing it cant be same
        hashmap.put("01","2222");
        hashmap.put("03","1111");
        hashmap.put("1111","3333");
        for(Map.Entry<String,String> entry : hashmap.entrySet()){
            System.out.println(entry.getKey() + ","+entry.getValue());

        }
//best ds to find frequency

    }
}
