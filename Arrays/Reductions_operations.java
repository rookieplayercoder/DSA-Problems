class Solution {
    public int reductionOperations(int[] nums) {
      int count = 0;
      int steps = 0;
      for(int i=1;i<nums.length;i++)
        {
          if(nums[i]!=nums[i-1]) steps++;
          count+=steps;
        }
      return count;
    }
}
