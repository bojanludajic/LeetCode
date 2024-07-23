package LeetCode75;

public class LC11 {

    public static void main(String[] args) {

    }

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int p = h * w;
            max = Math.max(max, p);

            if (height[left] > height[right]) {
                right -= 1;
            } else {
                left += 1;
            }
        }
        return max;
    }


}
