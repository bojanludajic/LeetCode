package daily;

import java.util.Arrays;

public class LC912 {

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1};
        for(int i : sortArray(arr)) {
            System.out.println(i);
        }
    }

    public static int[] sortArray(int[] nums) {
        if(nums.length == 1) {
            return nums;
        }

        int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);

        int[] res1 =  sortArray(left);
        int[] res2 = sortArray(right);

        return merge(res1, res2);
    }

    public static int[] merge(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length) {
            if(a[i] < b[j]) {
                res[k++] = a[i++];
            } else {
                res[k++] = b[j++];
            }
        }
        while(i < a.length) {
            res[k++] = a[i++];
        }
        while(j < b.length) {
            res[k++] = b[j++];
        }
        return res;
    }

}
