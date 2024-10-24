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
    public int pairSum(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        int max=0;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode nextnode , prev=null;
        while(s!=null){
            nextnode=s.next;
            s.next=prev;
            prev=s;
            s=nextnode;
        }
        while(prev!=null){
            max=Math.max(max,head.val+prev.val);
            prev=prev.next;
            head=head.next;
        }
        return max;
        
    }
}