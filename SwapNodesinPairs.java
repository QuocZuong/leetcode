
public class SwapNodesinPairs {
    public static class ListNode {
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

    public static ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode second = head.next;
        ListNode third = second.next;

        second.next = head;
        head.next = swapPairs(third);
        return second;

    }

    public static void main(String[] args) {
        Integer nodes[] = { 1, 2, 3, 4, 5 };
        ListNode head = new ListNode(nodes[0]);
        ListNode cur = head;
        for (int i = 1; i < nodes.length; i++) {
            ListNode temp = new ListNode(nodes[i]);
            cur.next = temp;
            cur = cur.next;
        }
        System.out.println();
    }
}
