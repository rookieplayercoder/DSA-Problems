class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      Map<Integer,Integer> map = new HashMap<>();
      int total = 0;
      int count = 0;
      map.put(0,1);
      for(int i:nums)
        {
          total+=i;
          int rem = total%k;
          if(rem<0) rem+=k;
          count+=map.getOrDefault(rem,0);
         map.put(rem,map.getOrDefault(rem,0)+1);
        }
      return count;
    }
}
