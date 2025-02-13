package Set_Interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckTwoSetsEqual {

    public static boolean checkSetEqual(Set<Integer> set, Set<Integer> set2){
        for(int i = 0; i < 3; i++){
            set.add(i+1);
        }

        for(int i = 3; i > 0; i--){
            set2.add(i);
        }
        System.out.println(set);
        System.out.println(set2);


        for(int i = 0; i < set.size(); i++){
//             if(!(set.contains(set2.get(i)))){
//                 return false;
//             }
            if(!(set.containsAll(Arrays.asList(set2.toArray())))){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        System.out.println(checkSetEqual(set,set2));


    }
}
