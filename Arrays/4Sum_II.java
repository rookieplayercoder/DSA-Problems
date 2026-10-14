class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int n = nums1.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int x = nums3[i]+nums4[j];
                map.put(x,map.getOrDefault(x,0)+1);
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int x = nums1[i]+nums2[j];
                int need = -x;
                count+=map.getOrDefault(-x,0);
            }
        }
        return count;
    }
}
