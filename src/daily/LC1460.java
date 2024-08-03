package daily;

import java.util.Arrays;

public class LC1460 {

    public static void main(String[] args) {
        int[] target = {1,2,3,4};
        int[] arr = {3,4,2,1};
        System.out.println(canBeEqual(target,arr));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        return Arrays.equals(mergeSort(target), mergeSort(arr));
    }

    private static int[] mergeSort(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums;

        int[] left = Arrays.copyOfRange(nums, 0, n/2);
        int[] right = Arrays.copyOfRange(nums, n/2, n);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                res[k++] = nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }
        while(i < nums1.length) {
            res[k++] = nums1[i++];
        }
        while(j < nums2.length) {
            res[k++] = nums2[j++];
        }
        return res;
    }


}
