class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
        int length = 0;
        while(left<right)
        {
            if(height[left] < height[right])
            {
                length = Math.min(height[left],height[right]);
                maxWater = Math.max(maxWater,length*(right-left));
                left++;
            }
            else 
            {
                length = Math.min(height[left],height[right]);
                maxWater = Math.max(maxWater,length*(right-left));
                right--; 
            }
        }
        return maxWater;
    }
}
