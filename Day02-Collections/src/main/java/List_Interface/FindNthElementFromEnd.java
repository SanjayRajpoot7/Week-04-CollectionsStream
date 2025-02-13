package List_Interface;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindNthElementFromEnd {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Collections.addAll(list,"A","B","C","D","E");
        int n = 2;
        String s = "";
        for(int i = 0; i <  list.size(); i++) {
            if (n > 0) {
                s = list.removeLast();
                n--;
            }
        }
        System.out.println(s);

    }
}
