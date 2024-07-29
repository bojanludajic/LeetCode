package daily;

public class LC1395 {

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 4, 1};

    }

    public static int numTeams(int[] rating) {
        int count = 0;
        for(int i = 0; i < rating.length - 2; i++) {
            for(int j = i  + 1; j < rating.length - 1; j++) {
                for (int k = i + 2; k < rating.length; k++) {
                    if((rating[i] < rating[j] && rating[j] < rating[k]) || (rating[i] > rating[j] && rating[j] > rating[k])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
