class Solution {
    public void reorderList(ListNode head) {
        // divide it into 2 linked list
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode a=slow.next;
        slow.next=null;
        // reverse the second half
        ListNode f=null;
        ListNode p=null;
        while(a!=null){
            f=a.next;
            a.next=p;
            p=a;
            a=f;
        }
        // p is the head of second ll
        temp=head;
        while(p!=null){
            ListNode next1=head.next;
            ListNode next2=p.next;
            head.next=p;
            p.next=next1;

            head=next1;
            p=next2;

        }
        

        

    }
}