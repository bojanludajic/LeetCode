package daily;

public class LC2678 {

    public static void main(String[] args) {

    }

    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            if(Integer.parseInt(detail.substring(10,11)) > 60) {
                count++;
            }
        }
        return count;
    }
}
