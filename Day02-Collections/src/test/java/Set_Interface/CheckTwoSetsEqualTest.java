package Set_Interface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckTwoSetsEqualTest {

    @Test
    public void checkSetEqual(){
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i < 3; i++){
            set.add(i+1);
        }

        for(int i = 3; i > 0; i--){
            set2.add(i);
        }


        for(int i = 0; i < set.size(); i++){

            if(!(set.containsAll(Arrays.asList(set2.toArray())))){
                System.out.println("false");
                break;
            }
            else{
                System.out.println("true");
            }
        }
        assertEquals(set,set2);

    }

}
