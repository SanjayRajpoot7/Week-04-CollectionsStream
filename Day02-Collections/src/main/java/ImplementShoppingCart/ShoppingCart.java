package ImplementShoppingCart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {

    public static void maintainOrder(Map<String, Integer> map){
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println(linkedHashMap);
        Map<String, Integer> treeMap = new TreeMap<>(linkedHashMap);

        for(Map.Entry<String, Integer> entry : treeMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Phone",7000);
        map.put("Bag",600);
        map.put("Cloths",1100);
        map.put("Watch",300);
        map.put("Biscuits",180);
        maintainOrder(map);
    }
}
