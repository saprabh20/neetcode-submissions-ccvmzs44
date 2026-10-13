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
        ListNode dummy = new ListNode(0);   // result list ke shuru mein ek extra node
        ListNode tail = dummy;              // result ka abhi ka aakhri node
        int carry = 0;                      // ab ListNode nahi, simple int

        // Jab tak koi bhi list bachi ho, YA carry bacha ho, tab tak chalo
        while (l1 != null || l2 != null || carry != 0) {
            // Jo list khatam ho gayi, uska digit 0 maano
            int d1 = (l1 != null) ? l1.val : 0;
            int d2 = (l2 != null) ? l2.val : 0;

            int sum = d1 + d2 + carry;
            carry = sum / 10;                       // agle column ke liye carry (0 ya 1)
            tail.next = new ListNode(sum % 10);     // is column ka digit
            tail = tail.next;

            // Pointer sirf tab aage badhao jab wo null na ho
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }
}
