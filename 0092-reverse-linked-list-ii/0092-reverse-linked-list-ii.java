class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        dummy.next=head;
    
        for(int i=1;i<left;i++){
            t=t.next;
        }
        
        ListNode tail1=t;
        ListNode head2=t.next;
      
       
       for(int i=1;i<=right-left+1;i++){   
            t=t.next;       
        }

        ListNode tail2=t;
        ListNode head3=t.next;

        tail1.next=null;
        tail2.next=null;


        ListNode p=null;
        ListNode curr=head2;

        while(curr!=null){
           ListNode f=curr.next;
            curr.next=p;
            p=curr;
            curr=f;
        }

        tail1.next=tail2;
        head2.next=head3;

        return dummy.next;      
        }  
    }
