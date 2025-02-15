package JUnit.BasicJUnitTest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {

        @Test
        public void addElement(){
            List<Integer> list = new ArrayList<>();

            list.add(5);
            list.add(2);
            list.add(1);
            assertEquals("[5, 2, 1]",list.toString());

    }

    @Test
    public void removeElement(){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(1);
        list.remove(0);

        assertEquals("[2, 1]",list.toString());
    }

    @Test
    public void getSize() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        assertEquals(2,list.size());
    }

}