package List_Interface;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfElement {

    public static Map<String, Integer> findFrequency(String[] values) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Iterate through the list and count the frequency of each element
        for (String element : values) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        return frequencyMap;
    }

        public static void main (String[]args){
            Map<String, Integer> map = new HashMap<>();
            String[] values = {"apple", "banana", "apple", "orange"};
            System.out.println(findFrequency(values));


        }
    }
