/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node deepCopy(Node head){
        Node dummy=new Node(0);
        Node t=dummy;
        Node t1=head;
        while(t1!=null){
            Node a=new Node(t1.val);
            t.next=a;
            t=t.next;
            t1=t1.next;
        }
        return dummy.next;
    }
    public void alternateConnect(Node head,Node head2){
        Node dummy=new Node(-1);
        Node t=dummy;
        Node t1=head;
        Node t2=head2;
        while(t2!=null){
           t.next=t1;
           t1=t1.next;
           t=t.next;

           t.next=t2;
           t2=t2.next;
           t=t.next;

        }
    }
    public void assignRandom(Node head,Node head2){
        Node t1=head;
        Node t2=head2;

        while(t1!=null && t2!=null){
             if(t1.random==null) t2.random=null;
            else t2.random=t1.random.next;
            t1=t1.next.next;
            if(t2.next!=null)t2=t2.next.next;
        }
    }
    public void splitList(Node head){
        Node t=head;
        Node d1=new Node(-1);
        Node d2=new Node(-1);
        Node t1=d1;
        Node t2=d2;

        while(t!=null){
        

        t1.next=t;
        t=t.next;
        t1=t1.next;

        t2.next=t;
        t=t.next;
        t2=t2.next;
        }
        t1.next=null;
        
    }
    public Node copyRandomList(Node head) {
        Node head2=deepCopy(head);
        alternateConnect(head,head2);
        assignRandom(head,head2);
        splitList(head);
        return head2;      
    }
}