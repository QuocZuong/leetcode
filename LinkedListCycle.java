import java.util.HashMap;

public class LinkedListCycle {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        // HashMap<ListNode, ListNode> map = new HashMap<>();
        // while (head != null && head.next != null) {
        // map.put(head, head.next);
        // if (map.containsKey(head.next)) {
        // return true;
        // } else {
        // head = head.next;
        // }
        // }
        // return false;

        ListNode tortoise = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;

            if (tortoise == hare) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        ListNode head6 = new ListNode(6);
        ListNode head7 = new ListNode(7);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;
        head7.next = head1;

        System.out.println(hasCycle(head1));
    }
}
