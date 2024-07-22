package daily;

public class LC2418 {

    public static void main(String[] args) {

    }

    public static String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0; i < names.length; i++){
            for(int j = i + 1; j < heights.length; j++){
                if(heights[i] > heights[j]) {
                    swap(names, i, j);
                    swap(heights, i, j);
                }
            }
        }
        return names;
    }

    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
