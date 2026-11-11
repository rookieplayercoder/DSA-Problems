class Solution {
    public int numberOfPairs(int[][] points) {
      int n = points.length;
      Arrays.sort(points,(a,b)->{
        if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
        return Integer.compare(b[1],a[1]);
      });
      int count = 0;
      for(int i=0;i<n-1;i++)
        {
          int y1 = points[i][1];
          int max= Integer.MIN_VALUE;
          int y=i+1;
          while(y<n)
            {
              int y2 = points[y][1];
              if(y2<=y1 && y2>max)
              {
                count++;
                max = Math.max(y2,max);
              }
              y++;
            }
        }
      return count;
    }
}
