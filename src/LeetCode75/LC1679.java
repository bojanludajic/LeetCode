package LeetCode75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC1679 {

    public static void main(String[] args) {
        int[] arr = {2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2};
        //int[] arr = {2, 2, 2, 3, 1, 1, 4, 1};
        maxOperations(arr, 3);
    }

    public static int maxOperations(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            int compl = k - num;
            if(map.getOrDefault(compl, 0) > 0) {
                count++;
                map.put(compl, map.get(compl) - 1);
                if(map.get(compl) == 0) {
                    map.remove(compl);
                }
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }

}