public class IntersectionofTwoLinkedLists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pointerA = headA; // pointer point to headA
        ListNode pointerB = headB; // pointer point to headB
        while (pointerA != pointerB) {
            if (pointerA != null) {
                pointerA = pointerA.next;
            } else {
                pointerA = headB;
            }

            if (pointerB != null) {
                pointerB = pointerB.next;
            } else {
                pointerB = headA;
            }
        }
        return pointerA;
    }

}