package LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1431 {

    public static void main(String[] args) {

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int c : candies) {
            max = Math.max(max, c);
        }
        Boolean[] res = new Boolean[candies.length];
        for(int i = 0; i < candies.length; i++) {
            res[i] = (candies[i] + extraCandies >= max);
        }
        return Arrays.asList(res);
    }

}
