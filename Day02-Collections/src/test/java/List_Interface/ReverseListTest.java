package List_Interface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class ReverseListTest {

    List<Integer> arraylist;
    List<Integer> linkedList;

    @BeforeEach
    public void initial() {
        arraylist = new ArrayList<>();
        linkedList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            arraylist.add(i);
            linkedList.add(i);
        }
    }
    @Test
    public void expectedArraylist(){
        ReverseList.reverseArrayList(arraylist);

        List<Integer> expectedList = new ArrayList<>();

        int j = 5;
        while(j > 0){
            expectedList.add(j);
            j--;
        }
        assertEquals(expectedList,arraylist);
    }

    @Test
    public void expectedLinkedList(){
        ReverseList.reverseLinkedList(linkedList);

        List<Integer> expectedList = new LinkedList<>();
        int k = 5;
        while(k > 0){
            expectedList.add(k);
            k--;
        }
        assertEquals(expectedList, linkedList);
    }

}