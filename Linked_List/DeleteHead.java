class Node{
  public int data;
  public Node next;
  Node(int data1,Node next1)
  {
    this.data = data1;
    this.next = next1;
  }
  Node(int data)
  {
    this.data = data;
    this.next = null;
  }
}
public class LinkedList
  {
    private static void print(Node head)
    {
      while(head != null)
        {
          System.out.print(head.data + " ");
          head = head.next;
        }
      System.out.println();
    }
    private static Node RemoveHead(Node head)
    {
     if(head == null) return head;
      head = head.next;
      return head;
    }
    public static void main(String a[])
    {
      int[] arr = {2,5,7,3};
      head  = RemoveHead(head);
      print(head);
    }
  }
