package random.linkedlist;

import java.util.Stack;

public class LC141 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            if(!stack.isEmpty() && stack.contains(cur)) {
                return true;
            }
            stack.push(cur);
            cur = cur.next;
        }
        return false;
    }



}
