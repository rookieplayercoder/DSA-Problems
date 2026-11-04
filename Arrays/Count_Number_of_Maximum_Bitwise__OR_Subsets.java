class Solution{
  int count = 0;
  void generate(int[] nums,int index,int currentOR,int maxOR)
  {
    if(index==nums.length)
    {
      if(currentOR==maxOR)
      {
        count++;
      }
      return;
    }
    generate(nums,index+1,currentOR | nums[index],maxOR);
    generate(nums,index+1,currentOR,maxOR);
  }
    public int countMaxOrSubsets(int[] nums) {
      int n = nums.length;
      int maxOR = 0;
      for(int i: nums)
        {
          maxOR |= i;
        }
      count = 0;
      generate(nums,0,0,maxOR);
      return count;
    }
}
