/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode carry = new ListNode();
        ListNode prev = new ListNode();
        ListNode head = null;
        int count = 0;
        while(c1 != null && c2 !=null) {
            int res = c1.val+c2.val+carry.val;
            carry.val = 0;
            int rem = 0;
            ListNode node = new ListNode();
            if(count < 1) {
                head = node;
                count++;
            }
            if(res > 9) {
                rem = res%10;
                carry.val = res/10;
                node.val = rem;
            } else {
                node.val = res;
            }
            prev.next = node;
            prev = node;
            c1 = c1.next;
            c2 = c2.next;
        }
        while(c1 != null) {
            int res = c1.val + carry.val;
            carry.val = 0;
            ListNode node = new ListNode();
            int rem = 0;
            if(res > 9) {
                rem = res%10;
                carry.val = res/10;
                node.val = rem;
            } else {
                node.val = res;
            }
            prev.next = node;
            prev = node;
            c1 = c1.next;
        }
        while(c2 != null) {
            int res = c2.val + carry.val;
            carry.val = 0;
            ListNode node = new ListNode();
            int rem = 0;
            if(res > 9) {
                rem = res%10;
                carry.val = res/10;
                node.val = rem;
            } else {
                node.val = res;
            }
            prev.next = node;
            prev = node;
            c2 = c2.next;
        }
        if(carry.val != 0) {
            ListNode node = new ListNode(carry.val);
            prev.next = node;
            prev = node;
        }

        return head;
    }
}
