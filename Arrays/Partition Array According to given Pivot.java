class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
      int n = nums.length;
      int low=0,equal=0;
      for(int i:nums)
        {
          if(i<pivot) low++;
          else if(i==pivot) equal++;
        }
      int[] res = new int[n];
      int left = 0,mid = low,right=low+equal;
      for(int i:nums)
        {
          if(i<pivot) res[left++]=i;
          else if(i==pivot) res[mid++]=i;
          else res[right++]=i;
        }
      return res;
    }
}
