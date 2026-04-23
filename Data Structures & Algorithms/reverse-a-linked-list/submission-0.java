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
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        while(curr.next != null) {
            System.out.println("curr = "+curr.val);
            ListNode temp = curr.next;
            System.out.println("temp = "+temp.val);
            curr.next = prev;
            prev = curr;
            System.out.println("prev = "+prev.val);
            curr = temp;
            System.out.println("curr = "+curr.val);
            temp = null;
            System.out.println("*****************");
        }
        head = curr;
        curr.next = prev;
        curr = null;
        prev = null;
        return head;
    }

    public void printLL(ListNode head) {
        ListNode i = head;
        System.out.println("TEST:");
        while(i.next != null) {
            System.out.print(i.val+ "->");
            i = i.next;
        }
    }
}
