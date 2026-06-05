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
public class Main{
  public static Node ConvertArrToLL(int[] arr)
  {
    if(arr.length == 0) return null;

    Node head = new Node(arr[0],null);
    Node current = head;

    for(int i = 1;i<arr.length;i++)
      {
        Node temp = new Node(arr[i]);
        current.next = temp;
        current = temp;
      }
    return head;
  }
  public static void printlist(Node head)
  {
    Node current = head;
    while(current!=null)
      {
        System.out.print(current.data + " -> ");
        current = current.next;
      }
    System.out.print("null");
  }
  public static void main(String a[])
  {
    int[] arr = {1,3,5,6};
    Node head = ConvertArrToLL(arr);
    System.out.println("Linked List: ");
    printlist(head);
  }
}
