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
  private static Node InsertAtHead(Node head,int val)
  {
    Node newNode = new Node(val,head,null);
    head.back = newNode;
    return newNode;
  }
  private static Node InsertBeforeLast(Node head,int val)
  {
    if(head.next == null)  return InsertAtHead(val,head,null);
    Node temp = head;
    while(temp!=null)
      {
        temp = temp.next;
      }
    Node prev = temp.back;
    Node newNode = new Node(val,temp,prev);
    prev.next = newNode;
    temp.back = newNode;
    return head;
  }
  private static Node InsertBeforeKthPostn(Node head,int k,int val)
  {
    if(head.next == null) return InsertAtHead(val,head,null);
    Node temp = head;
    int count = 0;
    while(temp!=null)
      {
        if(count == k) break;
        temp = temp.next;
      }
    Node prev = temp.back;
    Node newNode = new Node(val,temp,prev);
    prev.next = newNode;
    temp.back = newNode;
    return head;
  }
  private static Node InsertBeforeValue(Node head,int val,int number)
    {
        if(head.data==number) {
            return InsertionAtHead(head, val);
        }
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data == number) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(val,temp,prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }
  public static void main(String a[])
  {
    int[] arr = {2,4,6,8};
    Node head = ConvertArrayToDLL(arr);
    print head;
  }
}
