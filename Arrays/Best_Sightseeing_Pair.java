class Solution {
    public int maxScoreSightseeingPair(int[] values) {
      int maxI = values[0]+0;
      int res = 0;
      for(int i=1;i<values.length;i++)
        {
          res = Math.max(res,maxI+values[i]-i);
          maxI = Math.max(maxI,values[i]+i);
        }
      return res;
    }
}
