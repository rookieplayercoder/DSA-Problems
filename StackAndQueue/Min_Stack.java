class Node{
  int data;
  int currentMin;
  Node next;
  Node(int val,int curr_min,Node next)
  {
    this.data = val;
    this.currentMin = curr_min;
    this.next = next;
  }
}
class MinStack{
  private Node peek;
  private int min;
  public myStack(){
    this.peek = null;
    this.min = Integer.MAX_VALUE;
  }
  public void push(int x)
  {
    if(min>x) min = x;
    peek = new Node(x,min,peek);
  }
  public void pop()
  {
    peek = peek.next;
    if(peek == null) min=Integer.MAX_VALUE;
    else{
      min = peek.currentMin;
    }
  }
  public int top()
  {
    return peek.data();
  }
  public int getMIn()
  {
    return peek.currentMin;
  }
}
