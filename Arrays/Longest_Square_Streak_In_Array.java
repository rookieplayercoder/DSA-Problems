class Solution {
    public int longestSquareStreak(int[] nums) {
      int n = nums.length;
      Set<Integer> set = new HashSet<>();
      for(int i:nums)
        {
          set.add(i);
        }
      int max = 0;
      for(int i:nums)
        {
          int count = 1;
          long x = i*i;
          while(x*x<=Integer.MAX_VALUE && set.contains((long)(x*x)))
            {
              count++;
              x=x*x;
            }
          max = Math.max(max,count);
        }
      if(max<2) return -1;
      return max;
    }
}
