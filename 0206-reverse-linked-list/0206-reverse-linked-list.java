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
    public ListNode reverseList(ListNode head) {
        ListNode p=null;
        ListNode f=null;
        ListNode curr=head;
        while(curr!=null){
            f=curr.next;
            curr.next=p;
            p=curr;
            curr=f;
        }
        return p;
        
    }
}