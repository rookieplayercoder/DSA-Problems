class Solution{
  public static int Length(Node head)
  {
    Node temp = head;
    count = 0;
    while(temp!=null)
      {
        count++;
        temp = temp.next;
      }
    return count;
  }
}
