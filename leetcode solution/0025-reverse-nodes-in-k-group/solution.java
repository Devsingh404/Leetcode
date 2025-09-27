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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode temp1 = dummy;
        ListNode temp2 = head;

        ListNode it = head;
        int cnt = 1;

        while(it.next != null ){
            it = it.next;
            cnt++;
        }
        
        if(k>cnt) return head;

        int rev = cnt/k;
        for(int i=0 ; i<rev ; i++){
            ListNode tail = findTail(temp2 , k);
            ListNode currhead = temp2; 
            ListNode nextHead = tail.next;
            int[] grp = {k};
            ListNode newHead = reverse(temp2 , grp);

            temp1.next = newHead;
            currhead.next = nextHead;
            temp1 = currhead;
            temp2 = nextHead;
        }

        return dummy.next;
    }

    public ListNode findTail(ListNode head , int n){
        ListNode temp = head;
        while(n!=1){
            temp = temp.next;
            n--;
        }
        return temp;
    }

    public ListNode reverse(ListNode head, int[] n){
        if(n[0] == 1) return head;

        n[0]--;
        ListNode newHead = reverse(head.next, n);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;

    }
}
