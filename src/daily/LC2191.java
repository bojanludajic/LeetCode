package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LC2191 {

    public static void main(String[] args) {
        int[] mapping = {9,8,7,6,5,4,3,2,1,0};
        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        sortJumbled(mapping, nums);
    }

    public static int[] sortJumbled(int[] mapping, int[] nums) {
        int[] res = new int[nums.length];
        List<Integer> sorted = new ArrayList<Integer>();
        for(int i : nums) {
            sorted.add(i);
        }
        //return either the value after comparing or 0 to maintain the original order (making the sort stable)
        sorted.sort((i1, i2) -> {
                    int val = swapSystem(i1, mapping) - swapSystem(i2, mapping);
                    return val != 0 ? val : 0;
                }
        );
        for(int i = 0; i < sorted.size(); i++) {
            res[i] = sorted.get(i);
        }
        return res;
    }

    public static int swapSystem(int num, int[] mapping) {
        int i = 0;
        int pow = 1;
        do {
            i += mapping[num % 10] * pow;
            pow *= 10;
            num /= 10;
        } while(num > 0);
        return i;
    }
}
