class Solution{
  public static Node HasCycle(Node head)
  {
    Node slow = head;
    Node fast = slow;
    while(fast!=null && fast.next!=null)
      {
        slow = slow.next;
        fast = fast.next;
        if(slow == fast) return true;
      }
    return false;
  }
}
