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
        ListNode curr=head;
        int count=0;
        while(curr!=null && count!=k){
            curr=curr.next;
            count++;
        }
        if(count==k){
            curr=reverseKGroup(curr,k);
            while(count-->0){
                ListNode t=head.next;
                head.next=curr;
                curr=head;
                head=t;
            }
            head=curr;
        }
        return head;
    }
}