package Set_Interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionOfTwoSets {

    public static void unionInTwoSets(Set<Integer> set, Set<Integer> set2){
        for(int i = 0; i < 3; i++){
            set.add(i+1);
            set2.add(i+3);
        }
        System.out.println(set);
        System.out.println(set2);
        int totalSize = set.size() + set2.size();

            set.addAll(set2);

        System.out.println(set);
    }

    public static void intersectionOfTwoSets(Set<Integer> set, Set<Integer> set2){
        HashSet<Integer> intersection = new HashSet<>(set);
        intersection.retainAll(set2);
        System.out.println(intersection);

    }

    public static void main(String[] args) {
      Set<Integer> set = new HashSet<>();
      Set<Integer> set2 = new HashSet<>();

//      unionInTwoSets(set,set2);
       intersectionOfTwoSets(set,set2);

    }
}
