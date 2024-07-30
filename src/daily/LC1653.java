package daily;

import java.util.Stack;

public class LC1653 {

    public static void main(String[] args) {

    }

    public int minimumDeletions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        stack.push(s.charAt(s.length()-1));
        for(int i = s.length() - 2; i >= 0; i--) {
            if(!stack.isEmpty() && stack.peek() == 'a' && s.charAt(i) == 'b') {
                stack.pop();
                count++;
            } else {
                stack.push(s.charAt(i));
            }
        }
        return count;
    }

}
