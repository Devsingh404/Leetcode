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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        while(temp.next!=null){
            int node1 = temp.val;
            int node2 = temp.next.val;

            while (node2 != 0) {
                int tempval = node2;
                node2 = node1 % node2;
                node1 = tempval;
            }

            ListNode newNode = new ListNode(node1);
            ListNode nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
            temp = nextNode;
        }
        return head;
    }
}
