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
    public ListNode swapNodes(ListNode head, int k) {
        int n = 1;
        ListNode temp = head;

        while(temp.next!=null){
            temp = temp.next;
            n++;
        }

        int a = n-k+1;
        temp = head;
        ListNode temp2 = head;
        int i=1;
        int j=1;
        while(i!=k){
            temp = temp.next;
            i++;
        }
        while(j!=a){
            temp2 = temp2.next;
            j++;
        }
        
        int val = temp.val;
        temp.val = temp2.val;
        temp2.val = val;

        return head;
    }
}
