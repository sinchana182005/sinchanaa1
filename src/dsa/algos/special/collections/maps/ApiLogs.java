package dsa.algos.special.collections.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class ApiLogs {
    static void main(String[] args) {
        Map<String,String> logs = new LinkedHashMap<>();
        logs.put("2","Signup");
        logs.put("1","Login");
        logs.put("4","Browse Videos");
        logs.put("4","Browse Videos");
        logs.put("3","Scroll Up or Scroll down");
        logs.put("5","LogOut");
        System.out.println("API Logs" +logs);
    }
}
