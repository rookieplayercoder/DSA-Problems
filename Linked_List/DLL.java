Node class
  {
  int data ;
  Node next;
  Node back;
  Node(int data1,Node next1,Node back1)
    {
    this.data = data1;
    this.next = next1;
    this.back = back1;
    }
  Node(int data)
    {
    this.data = data;
    this.next = null;
    this.prev = null;
      }
  }
public class DLL{
  private static Node ConvertArrayToDLL(int[] arr)
  {
    if(arr.length == 0) return null;
    Node head = new Node(arr[0],null,null);
    Node prev = head;
    for(int i=1;i<arr.length;i++)
      {
        Node temp = new Node(arr[i],null,prev);
        prev.next = temp;
        prev = temp;
      }
    return head;
  }
  private static void print(Node head)
  {
    while(head != null)
      {
        System.out.print(head.data + " ");
        head = head.next;
      }
    System.out.println();
  }
  public static void main(String a[])
  {
    int[] arr = {2,4,6,8};
    Node head = ConvertArrayToDLL(arr);
    print head;
  }
}
