class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      int n = nums.length;
      List<Integer> list = new ArrayList<>();
      for(int i = 0;i<n;i++)
        {
          int k = Math.abs(nums[i]);
          if(nums[k-1]<0)
          {
            list.add(Math.abs(nums[i]);
            continue;
          }
          else
          {
            nums[k-1] = nums[k-1];
          }
        }
      return list;
    }
}
