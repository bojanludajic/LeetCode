package random.math;

public class LC1492 {

    public static void main(String[] args) {

    }

    public int kthFactor(int n, int k) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(n % i == 0) {
                count++;
            }
            if(count == k) {
                return i;
            }
        }
        return -1;
    }

}
