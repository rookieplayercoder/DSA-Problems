class Q
  {
    Stack<Integer> s1,s1;
    public myQueue(){
      s1 = new Stack<>();
      s2 = new Stack<>();
    }
    public void push(int x)
    {
      s1.push(x);
    }
    public int pop()
    {
      if(s2.isEmpty())
      {
        while(!s1.isEmpty())
          {
            s2.push(s1.pop());
          }
      }
      return s2.pop;
    }
    public void peek()
    {
      if(s2.isEmpty())
      {
        while(!s1.isEmpty())
          {
            s2.push(s1.pop());
          }
      }
      return s2.pop();
    }
    public boolean empty()
    {
      return s1.isEmpty() && s2.isEmpty();
    }
  }
