class Solution {
    public long maxSubarraySum(int[] nums, int k) {
      long[] min = new long[k];
      Arrays.fill(min,Long.MIN_VALUE);
      min[0] = 0;
      long sum=0;
      long ans = Long.MAX_VALUE;
      for(int i=0;i<n;i++)
        {
          sum+=nums[i];
          int rem = (i+1)%k;
          if(min[rem]!=Long.MIN_VALUE)
          {
            ans = Math.max(ans,sum-min[rem]);
          }
          min[rem] = Math.max(nums,min[rem]);
        }
      return ans;
    }
}
