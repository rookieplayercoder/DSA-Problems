class solution{
  public boolean canJump(int[] nums) {
    int farthest = 0;
    int n = nums.length;
    for(int i=0;i< n;i++)
      {
        if(i> farthest) return false;
        farthest = Math.max(farthest,nums[i] + i);
        if(i==n-1) return true;
      }
    return false;
  }
}
