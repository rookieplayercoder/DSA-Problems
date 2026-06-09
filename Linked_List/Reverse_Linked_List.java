class Solution
  {
    public static Node Reverse(Node head){
      if(head == null || head.next == null) return head;
      Node current = head;
      Node prev = null;
      while(current!=null)
        {
          Node temp = current.next;
          current.next = prev;
          prev = current;
          current = temp;
        }
      return prev;
    }
  }
