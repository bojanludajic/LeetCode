package LeetCode75;

public class LC1732 {

    public static void main(String[] args) {

    }

    public int largestAltitude(int[] gain) {
        int max = 0;
        int curSum = 0;
        for(int i = 0; i < gain.length; i++) {
            curSum += gain[i];
            max = Math.max(max, curSum);
        }
        return max;
    }

}
