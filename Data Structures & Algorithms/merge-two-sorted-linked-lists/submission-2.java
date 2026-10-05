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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 != null) {
            return list2;
        } else if(list1 != null && list2 == null) {
            return list1;
        } else if(list1 == null && list2 == null) {
            return null;
        }
        ListNode i = list1;
        ListNode j = list2;
        ListNode head = new ListNode();
        ListNode ptr = new ListNode();
        int count = 1;
        while(i != null && j != null) {
            ListNode node = new ListNode();
            if(i.val <= j.val) {
                node.val = i.val;
                i = i.next;
            } else {
                node.val = j.val;
                j = j.next;
            }
            ptr.next = node;
            ptr = ptr.next;
            if(count == 1) {
                head = node;
                ptr = head;
                count--;
            }

        }
        while(i != null) {
            ListNode node = new ListNode();
            node.val = i.val;
            i = i.next;
            ptr.next = node;
            ptr = ptr.next;
        }
        while(j != null) {
            ListNode node = new ListNode();
            node.val = j.val;
            j = j.next;
            ptr.next = node;
            ptr = ptr.next;
        }
        return head;
    }
}