import java.util.List;

public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;

            } else if (list1.val >= list2.val) {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        }

        if (list2 != null) {
            current.next = list2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        ListNode l1 = m.new ListNode(1);
        l1.next = m.new ListNode(2);
        l1.next.next = m.new ListNode(3);

        ListNode l2 = m.new ListNode(1);
        l2.next = m.new ListNode(3);
        l2.next.next = m.new ListNode(4);
        l2.next.next.next = m.new ListNode(5);
        l2.next.next.next.next = m.new ListNode(6);
        l2.next.next.next.next.next = m.new ListNode(7);

        ListNode result = m.mergeTwoLists(l1, l2);

        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}
