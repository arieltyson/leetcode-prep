package LinkedList.LinkedListTests;

import LinkedList.LinkedListProblems.ReverseLinkedList;
import LinkedList.ListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseLinkedListTest {

    @Test
    public void testReverseListIterative() {
        ReverseLinkedList rll = new ReverseLinkedList();

        // Test case 1: Normal case
        ListNode head1 = ListNode.arrayToList(new int[]{1, 2, 3, 4, 5});
        ListNode expected1 = ListNode.arrayToList(new int[]{5, 4, 3, 2, 1});
        assertEquals(expected1, rll.reverseListIterative(head1));

        // Test case 2: Single node
        ListNode head2 = ListNode.arrayToList(new int[]{1});
        ListNode expected2 = ListNode.arrayToList(new int[]{1});
        assertEquals(expected2, rll.reverseListIterative(head2));

        // Test case 3: Empty list
        ListNode head3 = ListNode.arrayToList(new int[]{});
        ListNode expected3 = ListNode.arrayToList(new int[]{});
        assertEquals(expected3, rll.reverseListIterative(head3));
    }

    @Test
    public void testReverseListRecursive() {
        ReverseLinkedList rll = new ReverseLinkedList();

        // Test case 1: Normal case
        ListNode head1 = ListNode.arrayToList(new int[]{1, 2, 3, 4, 5});
        ListNode expected1 = ListNode.arrayToList(new int[]{5, 4, 3, 2, 1});
        assertEquals(expected1, rll.reverseListRecursive(head1));

        // Test case 2: Single node
        ListNode head2 = ListNode.arrayToList(new int[]{1});
        ListNode expected2 = ListNode.arrayToList(new int[]{1});
        assertEquals(expected2, rll.reverseListRecursive(head2));

        // Test case 3: Empty list
        ListNode head3 = ListNode.arrayToList(new int[]{});
        ListNode expected3 = ListNode.arrayToList(new int[]{});
        assertEquals(expected3, rll.reverseListRecursive(head3));
    }
}