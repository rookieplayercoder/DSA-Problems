class Solution {
    public int partitionArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 1;
        int min = nums[0];
        int i=1;
        while(i<n)
        {
           if(nums[i]-min>k)
           {
            min = nums[i];
            count++;
           }
           i++;
        }
        return count;
    }
}
