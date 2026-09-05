class Solution{
  int left (int i)
  {
    return 2*i+1;
  }
  int right(int i)
  {
    return 2*i+2;
  }
  void Heapify(int[] nums,int i, int n)
  {
    int li = left(i);
        int ri = right(i);
        int largest = i;

        if(li<n && nums[li]>nums[largest])
        {
            largest = li;
        }
        if(ri<n && nums[ri]>nums[largest])
        {
            largest = ri;
        }
    while(largest!=i)
      {
        int temp = nums[largest];
        nums[largest] = nums[i];
        nums[i] = temp;
        Heapify(nums,largest,n);
      }
  }
  public int findKthLargest(int[] nums, int k) {
    int n = nums.length;
    for(int i=n/2-1;n>=0;i--)
      {
        Heapify(nums,i,n);
      }
    for(int i = 0;i<k-1;i++)
      {
        int temp = nums[0];
        nums[0] = nums[n-i-1];
        nums[n-i-1] = temp;
        Heapify(nums,0,n-i-1);
      }
    return nums[0];
  }
}
