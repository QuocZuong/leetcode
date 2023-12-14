public class ReverseLinkedList {
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

    public static ListNode reverseList(ListNode head) {
        return recursive(head, null);
    }

    public static ListNode recursive(ListNode head, ListNode previousNode) {
        if (head == null)
            return previousNode;

        ListNode nextNode = head.next;
        head.next = previousNode;
        return recursive(nextNode, head);
    }

    public static void main(String[] args) {

    }
}