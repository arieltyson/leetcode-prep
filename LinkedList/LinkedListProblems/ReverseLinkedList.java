package LinkedList.LinkedListProblems;


import LinkedList.ListNode;

public class ReverseLinkedList {

    // Iterative Solution
    public ListNode reverseListIterative(ListNode head) {

        ListNode current = head;
        ListNode previous = null;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    // Recursive Solution
    public ListNode reverseListRecursive(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode current, ListNode previous) {
        if (current == null) {
            return previous;
        }
        ListNode next = current.next;
        current.next = previous;
        return reverse(next, current);
    }
}