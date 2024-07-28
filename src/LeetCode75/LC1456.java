package LeetCode75;

import java.util.Set;
import java.util.HashSet;

public class LC1456 {

    public static void main(String[] args) {

    }

    public static int maxVowels(String s, int k) {
        int count = 0;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for(int i = 0; i < k; i++) {
            if(vowels.contains(s.charAt(i))) {
                count++;
            }
        }
        int max = count;
        for(int i = k; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i - k))) {
                count--;
            }
            if(vowels.contains(s.charAt(i))) {
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }

}
