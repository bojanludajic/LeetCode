package LeetCode75;

public class LC1071 {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        String gcd = "";
        int i = 0;
        int len1 = str1.length(), len2 = str2.length();
        while(len1 != len2) {
            if(len1 > len2) {
                len1 -= len2;
            } else {
                len2 -= len1;
            }
        }
        while(i < str1.length() && i < str2.length()) {
            if(str1.charAt(i) == str2.charAt(i) && gcd.length() < len1) {
                gcd += str1.charAt(i);
            }
            i++;
        }
        return ((str1 + str2).equals(str2 + str1)) ? gcd : "";
     }


}
