package LeetCode75;

public class LC443 {

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'a', 'b', 'b', 'b', 'c'};
        compress(chars);
    }

    public static int compress(char[] chars) {
        int i = 0;
        int pos = 0;
        while(i < chars.length) {
            int count = 1;
            while(i + count < chars.length && chars[i] == chars[i + count]) {
                count++;
            }
            chars[pos] = chars[i];
            pos++;
            if(count > 1) {
                for(char c : Integer.toString(count).toCharArray()) {
                    chars[pos] = c;
                    pos++;
                }
            }
            i += count;
        }
        return pos;
    }

}
