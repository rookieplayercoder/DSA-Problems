class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
      int n = deadline.length;
      int[][] temp = new int[n][2];
      for(int i=0;i<temp.length;i++)
        {
          temp[i][0] = deadline[i];
          temp[i][1] = profit[i];
        }
      int jobs=0;
      int prof = 0;
      boolean[] slot = new boolean[n+1];
      int i=0;
      while(i<n)
        {
          int dead = Math.min(temp[i][0],n);
          for(int j=dead;j>0;j++)
            {
              if(!slot[j])
              {
                jobs++;
                slot[j] = true;
                prof+=temp[i][1];
                break;
              }
            }
          i++;
        }
      ArrayList leaf = new ArrayList<>();
      leaf.add(jobs);
      leaf.add(prof);
      return leaf;
    }
}
