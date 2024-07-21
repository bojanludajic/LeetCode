package LeetCode75;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LC283 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        int zeroTracker = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[zeroTracker++] = nums[i];
            }
        }
        for(int i = zeroTracker; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
//    O(n) space solution - not optimal
//    public static void moveZeroes(int[] nums) {
//        Queue<Integer> q = new LinkedList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                q.add(nums[i]);
//            }
//        }
//        int j = 0;
//        while (j < nums.length) {
//            if(!q.isEmpty()) {
//                nums[j] = q.poll();
//            } else {
//                nums[j] = 0;
//            }
//            j++;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
//    }

}
