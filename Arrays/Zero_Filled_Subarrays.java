class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        int c =0;
        for(int i: nums)
        {
            if(i==0) c++;
            else
            {
             count+=(long) c*(c+1)/2; 
             c=0;
            }
        }   
            count+=(long) c*(c+1)/2;
        return count;
    }
}
