import Parents.ListNode;

public class partialRev {
    public static void main(String[] args) {
        int left = 2, right = 4;
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(reverseBetween(head, left, right));

    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode prev = head, curr = head;

        for (int i = 1; i < left; i++)
            curr = curr.next;

        for (int i = 1; i < left - 1; i++)
            prev = prev.next;

        ListNode start = curr, end = null, ahead = start.next;
        for (int i = 0; i < right - left + 1 && ahead != null; i++) {
            start.next = end;
            end = start;
            start = ahead;

            ahead = ahead.next;

        }

        // adjusting the pointers to return ans
        prev.next=end;
        curr.next=ahead;
        return prev;


    }

}
