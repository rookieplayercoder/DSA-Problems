class Stack{
  private int[] arr;
  private int top;
  public myStack(int n)
  {
   this.top = -1;
   arr = new int[n];
  }
  public boolean isEmpty()
  {
    return (top == -1);
  }
  public boolean isFull()
  {
    return (top == arr.length -1);
  }
  public void push(int x)
  {
    if(isFull()) return;
    top++;
    arr[top]=x;
  }
  public void pop()
  {
    if(isEmpty()) return;
    top--;
  }
  public int peek()
  {
    if(isEmpty()) return -1;
    return arr[top];
  }
}
