class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
      int n = nums.length;
      int m = pattern.length;
      int count = 0;
      for(int i=0;i<n-m-1;i++)
        {
          int j = i+m;
          if(isTrue(i,j,pattern,nums))
          {
            count++;
          }
        }
      return count;
    }
  public boolean isTrue(int i,int j, int[] pattern, int[] nums)
  {
    int k=0;
    for(int z=i;z<j;z++)
      {
        if(pattern[k]==1 && nums[z]>=nums[z+1])
            {
                return false;
            }
            if(pattern[k]==0 && nums[z]!=nums[z+1])
            {
                return false;
            }
            if(pattern[k]==-1 && nums[z]<=nums[z+1])
            {
                return false;
            }
        k++;
      }
    return true;
  }
}
