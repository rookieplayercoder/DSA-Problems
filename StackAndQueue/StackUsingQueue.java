class Queue{
  Queue<Integer> q = new LinkedList<>();
  public myStack()
  {}
  public void push(int x)
  {
    q.add(x);
  }
  public int pop()
  {
    int m = q.size();
    while(m>1)
      {
        q.add(q.remove());
        m--;
      }
    int x =q.peek();
    q.remove();
    return x;
  }
  public int top()
  {
    int m = q.size();
    while(m>1)
      {
        q.add(q.remove());
        m--;
      }
    int x = q.peek;
    q.add(q.remove());
    return x;
  }
  public boolean empty()
  {
    return q.isEmpty();
  }
}
