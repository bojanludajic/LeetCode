package LeetCode75;

public class LC724 {

    public static void main(String[] args) {

    }

    public int pivotIndex(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            int z = i + 1;
            int prefix = 0;
            int suffix = 0;
            while(j < i) {
                prefix += nums[j];
                j++;
            }
            while(z < nums.length) {
                suffix += nums[z];
                z++;
            }
            if(suffix == prefix) {
                return i;
            }
        }
        return -1;
    }

}
