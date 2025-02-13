package Set_Interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertSetIntoSortedList {

    public static void converted(Set<Integer> set){

        List<Integer> list = new ArrayList<>();
        list.addAll(set);
        System.out.println(list);
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);
        converted(set);
    }
}
