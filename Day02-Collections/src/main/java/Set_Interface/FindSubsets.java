package Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class FindSubsets {

    public static void findSubset(Set<Integer> set, Set<Integer> set2){
        set.add(2);
        set.add(3);
        for(int i = 0; i < 4; i++){
            set2.add(i+1);
        }
        System.out.println(set);
        System.out.println(set2);
        System.out.println(set2.containsAll(set));

    }
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        findSubset(set,set2);

    }
}
