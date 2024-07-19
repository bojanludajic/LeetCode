package daily;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LC1380 {

    public static void main(String[] args) {
        int[][] matrix = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> mins = new ArrayList<>();
        List<Integer> maxes = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                min = Math.min(matrix[i][j], min);
            }
            mins.add(min);
        }
        for(int i = 0; i < matrix[0].length; i++) {
            int max = matrix[0][i];
            for(int j = 0; j < matrix.length; j++) {
                max = Math.max(max, matrix[j][i]);
            }
            maxes.add(max);
        }
        List<Integer> res = new ArrayList<>();
        for(int i : mins) {
            if(maxes.contains(i)) res.add(i);
        }
        return res;
    }
}
