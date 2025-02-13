package List_Interface;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesPreservingOrder {

    public static void removeDuplicates(List<Integer> list){
       List<Integer> result = new ArrayList<>();

        System.out.println("Original List: "+list);
        for(Integer i : list){
            if(!(result.contains(i))){
                result.add(i);
            }
        }
        System.out.println(result);

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        removeDuplicates(list);
    }
}
