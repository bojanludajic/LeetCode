package LeetCode75;

public class LC1493 {

    public static void main(String[] args) {

    }

    public int longestSubarray(int[] nums) {
        int left = 0;
        int max = 0;
        int zeroCount = 0;
        boolean hasZero = false;
        for (int right = 0; right < nums.length; right++) {
            if(nums[right] == 0) {
                zeroCount++;
                hasZero = true;
            }
            while (zeroCount > 1) {
                if(nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            max = Math.max(max, right - left  + 1 - zeroCount);
        }
        return hasZero ? max : max - 1;
    }

}
