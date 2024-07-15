package LeetCode75;

public class LC1768 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "pqr";
        System.out.println(mergeAlternately(s1, s2));
    }
    public static String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        String res = "";
        while(i < word1.length() && j < word2.length()) {
            res += word1.charAt(i);
            res += word2.charAt(j);
            i++;
            j++;
        }
        while(i < word1.length()) {
            res += word1.charAt(i);
            i++;
        }
        while(j < word2.length()) {
            res += word2.charAt(j);
            j++;
        }
        return res;
    }
}
