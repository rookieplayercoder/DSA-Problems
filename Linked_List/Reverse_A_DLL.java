class Solution{
  public static Node Reverse(Node head)
  {
    if(head ==null || head.next == null) return head;
    Node current = head;
    Node prev = null;
    while(current!=null)
      {
        prev = current.back;
        current.back = current.next;
        current.next = prev;
        current = current.prev;
      }
    return prev.back;
  }
}
