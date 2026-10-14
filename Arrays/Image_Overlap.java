class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int maxOverlap = 0;
        for(int rowOff=-n+1;rowOff<n;rowOff++)
        {
            for(int colOff = -n+1;colOff<n;colOff++)
            {
                int count = countOverlapping(img1,img2,rowOff,colOff);
                maxOverlap = Math.max(maxOverlap,count);
            }
        } 
        return maxOverlap;
    }

    public int countOverlapping(int[][] img1, int[][] img2,int r, int c)
    {
        int n = img1.length;
        int count = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int B_i = i+r;
                int B_j = j+c;
                if(B_i <0 || B_i>=n ||B_j<0 || B_j>=n ) continue;
                if(img1[i][j]==1 && img2[B_i][B_j]==1)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
