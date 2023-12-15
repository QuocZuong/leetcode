function ListNode(val) {
    this.val = val;
    this.next = null;
}

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function (head) {
    if (!head?.next) return false;
    let hare = head.next;

    while (hare?.next) {
        if (head === hare) return true;
        hare = hare.next.next;
        head = head.next;
    }

    return false;
};

const head = new ListNode(3);
head.next = new ListNode(2);
head.next.next = new ListNode(0);
head.next.next.next = new ListNode(4);
head.next.next.next.next = head.next;
console.log(hasCycle(head));
