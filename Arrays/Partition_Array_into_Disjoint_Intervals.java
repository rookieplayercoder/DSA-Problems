class Solution {
    public int partitionDisjoint(int[] nums) {
      int localMax = nums[0],partitionIdx = 0,max = localMax;
      for(int i=1;i<nums.length;i++)
        {
          if(localMax>nums[i])
          {
            partitionIdx= i;
            localMax = max;
          }
          else max = Math.max(max,nums[i])
        }
      return partitionIdx+1;
    }
}
