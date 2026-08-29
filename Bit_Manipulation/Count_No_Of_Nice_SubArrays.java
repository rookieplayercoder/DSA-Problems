class Solution{
   public int numberOfSubarrays(int[] nums, int k) {
     Map<Integer,Integer> map = new HashMap<>();
     int count = 0;
     int sum = 0;
     for(int right = 0;right< nums.length;right++)
       {
         int i = nums[right]%2;
         sum+=map.getOrDefault(sum-k,0);
         map.put(sum,map.getOrDefault(sum,0)+1);
       }
     return count;
   }
}
