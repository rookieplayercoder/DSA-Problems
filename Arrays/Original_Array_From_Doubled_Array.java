class Solution {
    public int[] findOriginalArray(int[] changed) {
      int n = changed.length;
      if(n%2!=0) return new int[0];
      Arrays.sort(changed);
      for(int nums: changed)
        {
          map.put(nums,map.getOrDefault(nums,0)+1);
        }
      int[] ans = new int[n/2];
      int i = 0;
      for(int nums: changed)
        {
          if(map.getOrDefault(0,0)%2!0) return new int[0];
          if(map.getOrDefault(nums,0)==0) continue;
          int doub = nums*2;
          if(map.getOrDefault(doub,0)==0) return new int[0];
          ans[i++] == nums;
          map.put(map.get(nums)-1);
          map.put(map.get(doub)-1);
        }
      return ans;
    }
}
