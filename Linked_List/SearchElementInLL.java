class Solution{
  public static boolean Search(Node head,int val)
  {
    Node temp = head;
    while(temp!=null)
      {
        if(temp.data == val)
        {
          return true;
        }
        temp = temp.next;
      }
    return false;
  }
}
