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
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        HashMap<ListNode, Integer> hm = new HashMap<>();
        ListNode ptr = head;
        while(ptr.next != null) {
            if(hm.containsKey(ptr)) {
                return true;
            } else {
                hm.put(ptr, 0);
            }
            ptr = ptr.next;
        }
        return false;
    }
}
