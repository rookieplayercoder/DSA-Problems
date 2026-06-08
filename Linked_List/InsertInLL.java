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
public class Insert{
  private static Node ConvertArrToLL(int[] arr){
    if(arr.length==0) return null;
    Node head = new Node(arr[0]);
    Node current = head;
    for(int i=1;i<arr.length;i++)
      {
        Node temp = new Node(arr[i]);
        current.next = temp;
        current = temp;
      }
    return head;
  }
  private static void print(Node head)
  {
    while(head!=null)
      {
        System.out.print(head.data + " ");
        head = head.next;
      }
    System.out.println();
  }
  private static Node InsertAtHead(Node head,int val)
  {
    return new Node(val,head);
  }
  private static Node InsertAtLast(Node head,int val)
  {
    if(head == null)
        {
            return new Node(val,head);
        }
    Node temp = head;
    if(temp.next != null)
    {
      temp = temp.next;
    }
    Node newNode = new Node(val);
    temp.next = newNode;
    return head;
  }
  private static Node InsertAtKthPostn(Node head,int val,int number)
  {
    if(head == null)
        {
            return new Node(val,head);
        }
    int count = 1;
    Node prev = null;
    Node temp = head;
    while(temp!=null)
      {
        if(count ==k)
        {
          Node newNode = new Node(val);
          prev.next = newNode;
          newNode.next  = temp.next;
        }
        count++;
        prev = temp;
        temp = temp.next;
      }
    return head;
  }
  private static Node InsertUsingValue(Node head,int val,int number)
  {
    if(head.data == number)
        {
            return new Node(val,head);
        }
    Node prev = null;
    Node temp = head;
    while(temp!=null)
      {
        if(temp.data == number)
        {
          Node newNode = new Node(val);
          prev.next = newNode;
          newNode.next  = temp.next;
        }
        prev = temp;
        temp = temp.next;
      }
    return head;
  }
  public static void main(String a[])
  {
    int[] arr = {2,4,6,7};
    Node head = ConvertArrToLL(arr);
    print head;
    head = InsertionAtHead(head,100);
    print(head);
        head = InsertAtLast(head, 100);
    print(head);
        head = InsertAtKthPostn(head, 100, 2);
    print(head);
        head = InsertUsingValue(head, 100, 4);
        print(head);
  }
}
