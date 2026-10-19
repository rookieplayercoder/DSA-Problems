class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        int currentMin = nums[0];
        int min = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            currentMin=Math.min(nums[i],currentMin+nums[i]);
            min = Math.min(min,currentMin);
        }
        int sum = 0;
        for(int i:nums)
        {
            sum+=i;
        }
        if(maxSum>=0)
        {
            return Math.max(maxSum,sum-min);
        }
        return maxSum;

    }
}
