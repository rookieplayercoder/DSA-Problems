class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] ans = new int[queries.length];
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                sum+=nums[i];
            }
        }
        for(int i=0;i<queries.length;i++)
        {

           int k =  queries[i][0];
           int index = queries[i][1];
           if(nums[index]%2==0)
           {
            sum-=nums[index];
           }
           nums[index] += k;
           if(nums[index]%2==0)
           {
            sum+=nums[index];
           }
           ans[i] = sum;
        }
        return ans;
    }
}
