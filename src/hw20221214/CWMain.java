package hw20221214;

import java.util.HashMap;
import java.util.Map;

public class CWMain {


    public static void main(String[] args) {
        int[] ar1 = {1,2,3,4,5};
        int[] ar2 = {1,2,3,4, 2,5};
        System.out.println(findDouble(ar1));
        System.out.println(findDouble(ar2));

    }

    public static int findDouble(int[] array){
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : array) {
            if (map.containsKey(j)) {
                return j;
            } else {
                map.put(j, j);
            }
        }
        return -1;
    }

}