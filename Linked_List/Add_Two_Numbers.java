class Solution{
  public Node addTwoNumbers(Node l1,Node l2){
    Node dummy = new Node(0);
    Node tail = dummy;
    int carry = 0 ;
    while(l1!=null || l2!=null || carry!=0)
      {
        sum = carry;
        if(l1!=null)
        {
          sum+=l1.data;
          l1 = l1.next;
        }
        if(l2!=null)
        {
          sum+=l2.data;
          l2 = l2.next;
        }
        carry = sum/10;
        int digit = sum%10;
        tail.next = new Node(digit);
        tail = tail.next;
      }
    return dummy.next;
  }
}
