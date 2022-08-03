package day4;

import parent_class.*;

public class remove {

    public static ListNode deleteDuplicates(ListNode head) {

        // method to remove dupplicates from linke list
        if (head == null) {
            return null;
        }
        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        Solution s = new Solution();
        ListNode res = s.deleteDuplicates(head);
        System.out.println(res);

    }
}
