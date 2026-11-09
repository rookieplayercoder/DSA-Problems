class Solution {
    public int maximumSum(int[] nums) {
        int n = nums.length;
        int[] max = new int[100];
        Arrays.fill(max,0);
        int res = -1;
        for(int i=0;i<n;i++)
        {
            int sum = 0,temp=nums[i];
            while(temp>0)
            {
                sum+=temp%10;
                temp/=10;
            }

            if(max[sum]>0)
            {
                res = Math.max(res,max[sum]+nums[i]);
            }
            
            max[sum] = Math.max(max[sum],nums[i]);
        }
        return res;
    }
}
