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
        List<Integer> keys = new ArrayList<>(counts.keySet());
        keys.sort((k1, k2) -> {
            int mapVal = counts.get(k1)- counts.get(k2);
            if(mapVal != 0) {
                return mapVal;
            }
            return k2 - k1;
        });
        int c = 0;
        int[] res = new int[nums.length];
        for(int i = 0; i < keys.size(); i++) {
            int x = keys.get(i);
            int j = 0;
            while(j < counts.get(keys.get(i))) {
                res[c] = x;
                c++;
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
