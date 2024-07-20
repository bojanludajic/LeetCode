package daily;

public class LC1605 {

    public static void main(String[] args) {
        int[] rowSum = {5, 7, 10};
        int[] colSum = {8, 6, 8};
        restoreMatrix(rowSum, colSum);
    }

    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length;
        int m = colSum.length;
        int[][] res = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(rowSum[i] == 0) {
                    break;
                } else if(colSum[j] != 0) {
                    res[i][j] = Math.min(rowSum[i], colSum[j]);
                    rowSum[i] -= res[i][j];
                    colSum[j] -= res[i][j];
                }
            }
        }
        return res;
    }

}
