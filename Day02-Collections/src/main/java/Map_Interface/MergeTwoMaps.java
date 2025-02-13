package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {

    public static void mergeMaps(Map<String, Integer> map, Map<String, Integer> map2){

        Map<String, Integer> distinctMap = new HashMap<>(map);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            distinctMap.put(entry.getKey(), distinctMap.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }
        System.out.println(distinctMap);
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map2.put("B",3);
        map2.put("C",4);
        mergeMaps(map,map2);

    }
}
