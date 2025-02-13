package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class FindKeyWithHighestValue {

    public static void findHighestValue(Map<String, Integer> map){

        String key = null;
        int highestValue = 0;
       for(Map.Entry<String, Integer> entry : map.entrySet()){
             if(entry.getValue() > highestValue){
                 highestValue = entry.getValue();
                 key = entry.getKey();
             }
       }
        System.out.println(key);
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",15);
        findHighestValue(map);


    }
}
