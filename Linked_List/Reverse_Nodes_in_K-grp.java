class solution{
  public Node reversekgroup(Node head,int k)
  {
    Node dummy = new Node(0);
    dummy.next = head;
    Node Beforegrp = dummy;

    while(true){
      Node kNode = kthNode(BeforeGroup,k);
      if(kNode == null) break;
      Node afterGroup = kNode.next;
      Node groupTail = Beforegrp.next;
      Node current = Beforegrp.next;
      Node prev = afterGroup;
      if(int i = 0;i<k;i++)
        {
        Node temp = current.next;
        current.next = prev;
        prev = current;
          current = temp;
        }
      Beforegrp.next = kNode;
      Beforegrp = groupTail;
    }
    return dummy.next;
  }
    Node kthNode(Node head,int k)
      {
      Node current = head;
      while(current!=null && k>0)
        {
          current=cuurent.next;
          k---;
        }
      return current;
      }
}
