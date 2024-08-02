package daily;

import java.util.Arrays;

public class LC2134 {

    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,0,1,1,0};
        int[] nums1 = {1,1,0,0,1};
        int[] nums2 = {0, 0, 0};
        int[] nums3 = {0,1,0,0,1,0,0,0,1};
        System.out.println(minSwaps(nums));
    }

    public static int minSwaps(int[] nums) {
        int windowSize = 0;
        for(int i = 0; i < nums.length; i++) {
            windowSize += nums[i];
        }
        int[] appended = new int[nums.length * 2];
        for(int i = 0; i < nums.length; i++) {
            appended[i] = nums[i];
            appended[i + nums.length] = nums[i];
        }
        int count = 0;
        for(int i = 0; i < windowSize; i++) {
            if(appended[i] == 1) {
                count++;
            }
        }
        int maxWindow = count;
        for(int i = windowSize; i < appended.length; i++) {
            if(appended[i - windowSize] == 1) {
                count--;
            }
            if(appended[i] == 1) {
                count++;
            }
            maxWindow = Math.max(maxWindow, count);
        }
        return windowSize - maxWindow;
    }
}
