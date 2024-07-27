package LeetCode75;

public class LC643 {

    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(arr, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max = sum / k;
        for(int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            max = Math.max(max, sum / k);
        }
        return max;
    }

}
