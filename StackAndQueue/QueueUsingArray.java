class myQueue {
  private int start;
  private int end;
  private int[] arr;
  private currSize;
  private size;
  public myQueue(int n)
  {
    this.start = -1;
    this.end  =-1;
    arr = new int[];
    this.currSize = 0;
    this.size = n;
  }
  public boolean isEmpty()
  {
    return (currSize == 0);
  }
  public boolean isFull()
  {
    return (currSize == n);
  }
  public void enqueue(int x)
  {
    if(isFull()) return;
    else if(currSize == 0)
    {
      start = 0;
      end = 0;
    }
    else end = (end+1)%size;
    arr[end] = x;
    currSize++;
  }
  public void dequeue()
  {
    if(isEmpty()) return;
    else if(currSize == 1)
    {
      start = -1;
      end = -1;
    }
    else start=(start+1)%size;
    currSize--;
  }
  public int getFront() {
        // Get front element
        if(currSize == 0) return -1;
        return arr[start];
    }

    public int getRear() {
        // Get last element
        if(currSize == 0) return -1;
        return arr[end];
    }
}
