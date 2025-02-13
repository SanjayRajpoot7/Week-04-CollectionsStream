package List_Interface;

import java.util.ArrayList;
import java.util.List;

public class RotateElementList {
    public static void rotateList(List<Integer> list, int position){
        int size = list.size();


        // Split the list into two parts and rearrange
        List<Integer> rotatedList = new ArrayList<>();
        rotatedList.addAll(list.subList(position, size));  // Add the second part
        rotatedList.addAll(list.subList(0, position));

        System.out.println(rotatedList);

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int pos =2;
        for(int i = 0; i < 5; i++){
            list.add(i+1);
        }
        rotateList(list,pos);
    }
}
