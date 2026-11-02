class Solution {
    public int numTeams(int[] rating) {
      int n = rating.length;
      int count = 0;
      for(int j=1;j<n-1;j++)
        {
          int leftSmall = 0;
            int leftGreat = 0;
            int rightSmall = 0;
            int rightGreat = 0;
            
            for(int i=0;i<j;i++)
            {
                if(rating[i]<rating[j]) leftSmall++;
                else leftGreat++;
            }

            for(int k=j+1;k<n;k++)
            {
                if(rating[k]<rating[j]) rightSmall++;
                else rightGreat++;
            }

            count+=leftSmall*rightGreat;
            count+=leftGreat*rightSmall;
        }
        return count;
    }
}
