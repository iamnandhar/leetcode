package test.basics;

import src.basics.ListNode;
import src.basics.MiddleNode876;

import static org.junit.jupiter.api.Assertions.*;

class MiddleNode876Test {
    @org.junit.jupiter.api.Test
    void returnsMiddleNodeForOddLengthList() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = MiddleNode876.middleNode(head);
        assertEquals(3, result.val);
        assertEquals(4, result.next.val);
        assertEquals(5, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @org.junit.jupiter.api.Test
    void returnsMiddleNodeForEvenLengthList() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode result = MiddleNode876.middleNode(head);
        assertEquals(4, result.val);
        assertEquals(5, result.next.val);
        assertEquals(6, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @org.junit.jupiter.api.Test
    void returnsHeadForSingleElementList() {
        ListNode head = new ListNode(1);
        ListNode result = MiddleNode876.middleNode(head);
        assertEquals(1, result.val);
        assertNull(result.next);
    }

    @org.junit.jupiter.api.Test
    void returnsNullForEmptyList() {
        ListNode head = null;
        ListNode result = MiddleNode876.middleNode(head);
        assertNull(result);
    }
}