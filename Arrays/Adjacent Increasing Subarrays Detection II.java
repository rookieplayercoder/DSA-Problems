class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
      int n = nums.length;
      int prev = 0;
      int curr = 1;
      int ans = 0;
      for(int i=1;i<n;i++)
        {
          if(nums.get(i)>nums.get(i-1))
          {
            curr++;
          }
          else
          {
            ans = Math.max(ans,Math.max(curr/2,Math.min(prev,curr)));
            prev = curr;
            curr = 1;
          }
        }
      ans = Math.max(ans,Math.max(curr/2,Math.min(prev,curr)));
      return ans;
    }
}
