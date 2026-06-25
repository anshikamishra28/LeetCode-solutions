class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode fwd=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        int carry=0;
        while(t1!=null || t2!=null || carry!=0){
            int sum=carry;
            if(t1!=null){
                sum+=t1.val;
                t1=t1.next;
            }
            if(t2!=null){
                sum+=t2.val;
            t2=t2.next;      
            }  
            
            carry=sum/10;
            sum=sum%10;
    
            ListNode a=new ListNode(sum);
            t.next=a; 
            t=t.next;
        }
            return reverse(dummy.next);
           
        }
        
        
    }
