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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int tmp = 1;
        if(head.next == null) {
            return null;
        }
        ListNode ptr = head;
        while(ptr.next != null) {
            ptr = ptr.next;
            tmp++;
        }
        int k = 0;
        ListNode curr = head;
        ListNode prev = null;
        while(k < tmp - n) {
            prev = curr;
            curr = curr.next;
            k++;
        }
        if(curr == head) {
            return head.next;
        }
        prev.next = curr.next;
        curr.next = null;
        
        return head;
    }
}
