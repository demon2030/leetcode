package problems.add_two_numbers;

/**
 * https://leetcode.com/problems/add-two-numbers
 */
public class Solution {

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        ListNode sumRoot = sum;
        int mem = 0;
        boolean ll1, ll2;
        ll1 = ll2 = false;
        sum.val = l1.val+l2.val;
        mem = sum.val / 10;
        sum.val = sum.val % 10;
        while(l1.next != null || l2.next != null) {
            sum.next = new ListNode(0);
            sum = sum.next;
            if (l1.next != null) {
                l1 = l1.next;
            } else {
                ll1 = true;
            }
            if (l2.next != null) {
                l2 = l2.next;
            } else {
                ll2 = true;
            }

            sum.val = (ll1 == true ? 0 : l1.val) + (ll2 == true ? 0 : l2.val) + mem;
            mem = sum.val / 10;
            sum.val = sum.val % 10;
        }
        if (mem > 0) {
            sum.next = new ListNode(mem);
        }
        return sumRoot;
    }

    public static void main(String[] args) {

    }
}
