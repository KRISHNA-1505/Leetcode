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
        ListNode curr=head;
        Stack<Integer>s=new Stack<>();
        while(curr!=null)
        {
            s.push(curr.val);
            curr=curr.next;
        }
        curr=head;
        int c=1;
        int max=0;
        int n=s.size();
        while(c<=n/2){
            max=Math.max(max,curr.val+s.peek());
            curr=curr.next;
            s.pop();
            c++;
        }
        return max;
    }
}