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
    public ListNode swapPairs(ListNode head) {
        if (head==null || head.next==null)
            return head;
        ListNode node = new ListNode();
        // node.next = head;
        ListNode node1 = node;
        ListNode node2 = head;
        while(node2 != null && node2.next != null){
            //System.out.println(node1.val+\ \+node2.val);
            node1.next = node2.next;
            node2.next = node1.next.next;
            node1.next.next = node2;
            node1 = node2;
            node2 = node2.next;
        }
        return node.next;
    }
}