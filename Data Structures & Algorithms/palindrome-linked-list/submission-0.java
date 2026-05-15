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
    public boolean isPalindrome(ListNode head) {
        ListNode ptr = head;
        int n = 0;
        while(ptr != null) {
            n++;
            ptr = ptr.next;
        }
        int[] arr = new int[n];
        ListNode ptr1 = head;
        int i = 0;
        while(ptr1 != null) {
            arr[i] = ptr1.val;
            i++;
            ptr1 = ptr1.next;
        }
        int l = 0;
        int r = arr.length - 1;
        while(l<r) {
            if(arr[l] != arr[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}