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
        ListNode dummy = new ListNode(-1);
        int carry = 0;
        ListNode temp = dummy;

        while(l1 != null || l2 != null || carry==1){
            int val1 = 0;
            if(l1 != null) val1 = l1.val;

            int val2 = 0;
            if(l2 != null) val2 = l2.val;

            int sum = val1 + val2 + carry;
            int num = sum%10;
            carry = sum/10;

            ListNode newNode = new ListNode(num);
            temp.next = newNode;
            temp = temp.next; 
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }

        return dummy.next;

    }
}
