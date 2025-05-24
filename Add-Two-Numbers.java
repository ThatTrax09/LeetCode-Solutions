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
        ListNode num1 = l1;
        ListNode num2 = l2;
        int carry = 0;
        ListNode sum = new ListNode(0);
        ListNode tail = sum;
        while(num1 != null || num2 != null || carry != 0){
            int v1 = (num1 != null) ? num1.val : 0;
            int v2 = (num2 != null) ? num2.val : 0;

            ListNode s = new ListNode(0);
            s.val = (v1 + v2 + carry) % 10;
            carry = (v1 + v2 + carry) / 10;
            
            tail.next = s;
            tail = tail.next;            
            
            num1 = (num1 != null) ? num1.next : null;
            num2 = (num2 != null) ? num2.next : null;
            }
        return sum.next;
    }
}