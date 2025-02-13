package Set_Interface;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class FindSubsetsTest {

    @Test
    public void findSubset() {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set.add(2);
        set.add(3);
        for (int i = 0; i < 4; i++) {
            set2.add(i + 1);
        }
   assertEquals(true, set2.containsAll(set));

    }
}