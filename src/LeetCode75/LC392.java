package LeetCode75;

public class LC392 {

    public static void main(String[] args) {
        System.out.println(isSubsequence("b", "abc"));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int i = 0;
        int j = 0;
        while(i < t.length() && j < s.length()) {
            if(s.charAt(j) == t.charAt(i)) {
                j++;
            }
            i++;
        }
        return j == s.length();
    }

}
