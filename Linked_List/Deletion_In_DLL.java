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
  private static Node DeleteAtHead(Node head)
  {
    if(head == null || head.next == null) return null;
    Node prev = head;
    head = head.next;
    prev.next = null;
    head.back = null;
    return head;
  }
  private static Node DeleteAtLast(Node head)
  {
    if(head == null || head.next == null) return null;
    Node temp = head;
    while(temp.next.next != null)
      {
        temp = temp.next;
      }
    Node prev = temp.next;
    prev.back = null;
    temp.next = null;
    return head;
  }
  private static Node DeleteAtKthPostn(Node head,int k)
  {
    if(head == null || head.next == null) return null;
    if(k == 1) return InsertAtHead(val,head,null);
    int count  = 0;
    Node temp = head;
    while(temp!=null)
      {
        if(count == k) break;
        count++;
        temp = temp.next;
      }
    Node prevNode = temp.back;
    Node nextNode = temp.next;
    if(prevNode != null) prevNode.next = nextNode;
    if(nextNode != null) newNode.back = prevNode;
    return head;
  }
  private static Node DeleteUsingValue(Node head,int num)
  {
    if(head == null || head.next == null) return null;
    if(head.data == num) return InsertAtHead(val,head,null);
    Node temp = head;
    while(temp!=null)
      {
        if(temp.data == num) break;
        temp = temp.next;
      }
    Node prevNode = temp.back;
    Node nextNode = temp.next;
    if(prevNode != null) prevNode.next = nextNode;
    if(nextNode != null) newNode.back = prevNode;
    return head;
  }
  public static void main(String a[])
  {
    int[] arr = {2,4,6,8};
    Node head = ConvertArrayToDLL(arr);
    print head;
  }
}
