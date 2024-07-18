package LeetCode75;

import java.util.Stack;

public class LC151 {

    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        String[] words = s.trim().replaceAll(" +", " ").split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = words.length - 1; i >=0; i--) {
            res.append(words[i]).append(" ");
        }
        return res.toString().trim();
    }
}
