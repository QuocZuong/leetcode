public class AddTwoNumbers {

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;

            int total = val1 + val2 + carry;

            carry = total >= 10 ? 1 : 0;
            current.next = new ListNode(total % 10);
            current = current.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers a = new AddTwoNumbers();
        ListNode l1 = a.new ListNode(2);
        l1.next = a.new ListNode(4);
        l1.next.next = a.new ListNode(3);

        ListNode l2 = a.new ListNode(5);
        l2.next = a.new ListNode(6);
        l2.next.next = a.new ListNode(4);

        ListNode result = a.addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}