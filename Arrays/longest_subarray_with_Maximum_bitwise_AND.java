class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int n = nums.length;
        int count = 0;
        int large = 0;
        for(int i: nums)
        {
            large = Math.max(large,i);
        }
        for(int i: nums)
        {
            if(i==large)
            {    
            max = Math.max(max,++count);
            }
            else count = 0;
        }
        return max;
    }
}
