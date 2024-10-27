package test.practice;

import org.junit.jupiter.api.Test;
import src.basics.ListNode;
import src.practice.AddTwoNum;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumTest {

    @Test
    void addsTwoNumbersWithSameLength() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        AddTwoNum addTwoNum = new AddTwoNum();
        ListNode result = addTwoNum.addTwoNumbers(l1, l2);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
    }

    @Test
    void addsTwoNumbersWithDifferentLengths() {
        ListNode l1 = new ListNode(9, new ListNode(9));
        ListNode l2 = new ListNode(1);
        AddTwoNum addTwoNum = new AddTwoNum();
        ListNode result = addTwoNum.addTwoNumbers(l1, l2);
        assertEquals(0, result.val);
        assertEquals(0, result.next.val);
        assertEquals(1, result.next.next.val);
    }

    @Test
    void addsTwoNumbersWithCarryOver() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        AddTwoNum addTwoNum = new AddTwoNum();
        ListNode result = addTwoNum.addTwoNumbers(l1, l2);
        assertEquals(0, result.val);
        assertEquals(1, result.next.val);
    }

    @Test
    void addsTwoNumbersWithLeadingZeros() {
        ListNode l1 = new ListNode(0, new ListNode(1));
        ListNode l2 = new ListNode(0, new ListNode(9));
        AddTwoNum addTwoNum = new AddTwoNum();
        ListNode result = addTwoNum.addTwoNumbers(l1, l2);
        assertEquals(0, result.val);
        assertEquals(0, result.next.val);
        assertEquals(1, result.next.next.val);
    }

    @Test
    void addsTwoEmptyLists() {
        ListNode l1 = null;
        ListNode l2 = null;
        AddTwoNum addTwoNum = new AddTwoNum();
        ListNode result = addTwoNum.addTwoNumbers(l1, l2);
        assertNull(result);
    }
}