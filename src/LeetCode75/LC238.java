package LeetCode75;

import java.util.HashMap;
import java.util.Map;

public class LC238 {

    public static void main(String[] args) {

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            res[i] = 1;
        }
        int pre = 1;
        for(int i = 0; i < nums.length; i++){
            res[i] *= pre;
            pre *= nums[i];
        }
        int post = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            res[i] *= post;
            post *= nums[i];
        }
        return res;
    }


}
