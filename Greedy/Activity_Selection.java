class Solution {
    public int activitySelection(int[] start, int[] finish) {
      int n = start.length;
      if(n==0) return 0;
      int[][] temp = new int[n][2];
      for(int i=0;i<temp.length;i++)
        {
          temp[i][0] = start[i];
          temp[i][1] = finish[i];
        }
      Arrays.sort(temp, (a,b)->Integer.compare(a[1],b[1]);
      int count = 1;
      int last = temp[0][1];
      for(int i=1;i<temp.length;i++)
        {
          if(temp[i][0]>last)
          {
            count++;
            last = temp[i][1];
          }
        }
      return count;
    }
}
