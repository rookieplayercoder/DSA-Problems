class Solution {
    public void reverse(int[] arr,int start,int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public List<Integer> pancakeSort(int[] arr) {
      int n = arr.length;
      List<Integer> temp = new ArrayList<>();
      for(int size=n;size>1;size--)
        {
          int maxV = 0;
          for(int i=1;i<size;i++)
            {
              if(arr[i]> arr[maxV])
              {
                maxV = i;
              }
              if(maxV == size-1)
              {
                continue;
              }
              if(maxV >0)
              {
                reverse(arr,0,maxV);
                temp.add(maxV+1);
              }
              reverse(arr,0,size-1);
              temp.add(size);
            }
        }
      return temp;
    }
}
