class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        int k = count-n+1;
        int t =0;
        if(k==1)
        {
            head = head.next;
            return head;
        };
        ListNode prev = null;
        ListNode newNode = head;
        while(newNode!=null)
        {
            t++;
            if(t==k)
            {
                prev.next = prev.next.next;
                break;
            }
            prev = newNode;
            newNode = newNode.next;
        }
        return head;
    }

}
