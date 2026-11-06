class Solution {
    public boolean canSortArray(int[] nums) {
      int n = nums.length;
      int prevMax=0;
      int i=0;
      while(i<n)
        {
          int bits = Integer.bitCount(nums[i]);
          int currMin = nums[i];
          int currMax = nums[i];
          while(i<n && Integer.bitCount(nums[i])==bits)
            {
              currMin = Math.min(nums[i],currMin);
              currMax = Math.max(nums[i],currMax);
              i++;
            }
          if(prevMax>currMin) return false;
          prevMax = currMax;
        }
      return true;
    }
}
