package LeetCode75;

public class LC605 {

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1};
        canPlaceFlowers(arr, 2);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++) {
            if((flowerbed[i] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) && (i == 0 || flowerbed[i - 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
        }
        return count >= n;
    }

}
