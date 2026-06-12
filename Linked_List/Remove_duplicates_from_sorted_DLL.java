class Solution
  {
    Node remove(Node head)
    {
      Node current = head;
      while(current!=null && current.next!=null)
        {
          int xor = current.data^current.next.data;
          if(xor==0)
          {
            Node temp = current.next.next;
            current.next = temp;
            if(temp!=null)
            {
              temp.prev = current;
            }
            else current = current.next;
          }
        }
      return head;
    }
  }
