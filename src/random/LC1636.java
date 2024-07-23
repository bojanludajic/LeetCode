package random;

import java.util.*;

public class LC1636 {

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        frequencySort(nums);
    }

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for(int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        List<Integer> numList = new ArrayList<>(counts.keySet());
        numList.sort((n1, n2) -> {
            int val = counts.get(n1) - counts.get(n2);
            if(val != 0) {
                return val;
            }
            return n2 - n1;
        });
        int[] res = new int[nums.length];
        int c = 0;
        for(int i : numList) {
            int j = 0;
            while(j < counts.get(i)) {
                res[c++] = i;
                j++;
            }
        }
        return res;
    }

    //    Custom comparator instead of lambda in the method
//    static class MapCountComparator implements Comparator<Integer> {
//        private final Map<Integer, Integer> map;
//
//        public MapCountComparator(Map<Integer, Integer> map) {
//            this.map = map;
//        }
//
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            int val = map.get(o1) - map.get(o2);
//            if(val != 0) {
//                return val;
//            }
//            return o2 - o1;
//        }
//    }

}
