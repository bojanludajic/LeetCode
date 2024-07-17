package LeetCode75;

import java.util.Stack;

public class LC345 {

    public static void main(String[] args) {
        String h = "hello";
        System.out.println(reverseVowels(h));
    }

    public static String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c == 'a' || c == 'A' ||
                    c == 'e' || c == 'E' ||
                    c == 'i' || c == 'I' ||
                    c == 'o' || c == 'O' ||
                    c == 'u' || c == 'U') {
                sb.append("*");
                stack.push(c);
            } else {
                sb.append(c);
            }
        }
        for(int i = 0; i < sb.length(); i++) {
                if(sb.charAt(i) == '*') {
                    sb.replace(i, i+ 1, stack.pop().toString());
                }
        }
        return sb.toString();
    }

}
