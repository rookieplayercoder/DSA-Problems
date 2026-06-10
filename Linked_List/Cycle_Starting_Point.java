class Solution{
  public Node CycleStarting(Node head){
    Node slow = head;
    Node fast =head;
    while(fast!=null && fast.next!=null)
    {
      slow = slow.next;
      fast = fast.next.next;
      if(slow==fast)
      {
        slow = head;
        while(slow!=fast)
          {
            slow= slow.next;
            head = head.next;
          }
        return head;
      }
    }
    return null;
}
}
