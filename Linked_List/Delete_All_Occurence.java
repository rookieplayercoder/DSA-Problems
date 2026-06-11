class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // code here
        if(head == null)return null;
        while(head!=null &&head.data == x)
        {
            head = head.next;
            if(head!=null)
            {
                head.prev = null;
            }
        }
        Node temp = head;
        while(temp!=null)
        {
            Node nextNode = temp.next;
            if(temp.data == x)
            {
                Node back = temp.prev;
                Node far = temp.next;
                if(back!= null) back.next = far;
                if(far!=null) far.prev = back;
                temp.prev = null;
                temp.next = null;
            }
            
            temp = nextNode;
        }
        return head;
    }
}
