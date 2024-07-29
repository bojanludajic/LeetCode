package random;

public class LC485 {

    public static void main(String[] args) {

    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            int j = i;
            while(j < nums.length && nums[j] != 0) {
                count++;
                j++;
            }
            max = Math.max(max, count);
        }
        return max;
    }

}
