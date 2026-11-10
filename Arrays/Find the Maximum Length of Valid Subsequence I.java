class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        int countEven = 0;
        int countOdd = 0;
        int endEven = 0;
        int endOdd = 0;
        for(int i:nums)
        {
            if(i%2==1)
            {
                countOdd++;
                endOdd = endEven+1;
            }
            else
            {
                countEven++;
                endEven = endOdd+1;
            }
        }
        int max = Math.max(Math.max(countEven,countOdd),Math.max(endEven,endOdd));
        return max;
    }
}
