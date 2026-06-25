class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        // break into equal half
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode a=slow.next;
        slow.next=null;   

        //reverse
             
        ListNode p=null;
        ListNode f=null;
        while(a!=null){
            f=a.next;
            a.next=p;
            p=a;
            a=f;
        }    

        // compare
        temp=head;
        ListNode temp2=p;
        while(temp2!=null){
            if(temp.val!=temp2.val) return false;
            temp=temp.next;
            temp2=temp2.next;
        }
        return true;

        
    }
    
    
}