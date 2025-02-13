package List_Interface;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FindFrequencyOfElementTest {

    @Test
    public void findFrequency() {
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Iterate through the list and count the frequency of each element
        String[] values = new String[0];
        for (String element : values) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
//        assertArrayEquals("{banana:1, orange:1, apple:2}",frequencyMap);
    }

}