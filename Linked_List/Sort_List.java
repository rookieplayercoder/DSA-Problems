class Solution{
  public Node sortList(Node head)
  {
    if(head == null || head.next == null) return head;

    Node mid = getMid(head);
    Node midNext = mid.next;
    mid.next = null;

    Node leftSort = head;
    Node rightSort = midNext;

    return merge(leftSort,rightSort);
  }
  public Node getMid(Node head)
  {
    Node slow = head;
    Node fast = head;
    while(fast!=null && fast.next!=null && fast.next.next!=null)
      {
        slow = slow.next;
        fast = fast.next.next;
      }
    return slow;
  }
  public Node merge(Node list1,Node list2)
  {
    Node dummy = new Node(0);
    Node temp = dummy;

    while(list1!=null && list2!=null)
      {
        if(list1.val <= list2.val)
        {
          temp.next = list1;
          list1 = list1.next;
        }
        else 
        {
          temp.next = list2;
          list2 = list2.next;
        }
        temp = temp.next;
      }
    if(list1!=null){
      temp.next = list1;
      list1 = list1.next;
    }
    else
    {
      temp.next = list2;
      list2 = list2.next;
    }
    return dummy.next;
  }
}
