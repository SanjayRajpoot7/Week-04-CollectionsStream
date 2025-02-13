package Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

    public static void differenceInBothSets(Set<Integer> set, Set<Integer> set2){
        for(int i = 0; i < 3; i++){
            set.add(i+1);
            set2.add(i+3);
        }
        System.out.println(set);
        System.out.println(set2);

        // Create a copy of set1 to work with (to preserve original set1)
        HashSet<Integer> symmetricDifference = new HashSet<>(set);

        // Remove elements that are in both set and set2
        symmetricDifference.removeAll(set2);

        // Add elements that are in set2 but not in set
        set2.removeAll(set);

        // Add the elements from set2 to the symmetricDifference
        symmetricDifference.addAll(set2);
        System.out.println(symmetricDifference);
    }
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        differenceInBothSets(set,set2);
    }
}
