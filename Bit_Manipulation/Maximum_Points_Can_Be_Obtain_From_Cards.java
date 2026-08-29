class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int n = cardPoints.length;
      int size = n-k;

      int total = 0;
      for(int i = 0;i<n;i++)
        {
          total+=cardPoints[i];
        }

      int windowsum = 0;
      for(int i=0;i<size;i++)
        {
          windowsum+=cardPoints[i];
        }
      int minwindow = windowsum;
      for(int i = size;i<n;i++)
        {
          windowsum+=cardPoints[i];
          windowsum-=cardPoints[i-size];
          minwindow = Math.min(minwindow,windowsum);
        }
      return total-minwindow;
    }
}
