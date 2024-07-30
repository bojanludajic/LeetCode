package random.linkedlist;

public class LC21 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first = list1;
        ListNode second = list2;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (first != null && second != null) {
            if(first.val < second.val) {
                cur.next = first;
                first = first.next;
            } else {
                cur.next = second;
                second = second.next;
            }
            cur = cur.next;
        }
        while(first != null) {
            cur.next = first;
            cur = cur.next;
            first = first.next;
        }
        while(second != null) {
            cur.next = second;
            cur = cur.next;
            second = second.next;
        }
        return dummy.next;
    }

}
