class Solution{
  public int numSubarraysWithSum(int[] nums, int goal)
  {
    Map<Integer,Integer> map = new HashMap<>();
    int count = 0;
    int sum = 0;
    map.put(0,1);
    for(int right=0;right<nums.length;right++)
      {
        sum+=nums[right];
        count+=map.getOrDefault(sum-goal,0);
        map.put(sum,map.getOrDefault(sum,0)+1);
      }
    return count;
  }
}
