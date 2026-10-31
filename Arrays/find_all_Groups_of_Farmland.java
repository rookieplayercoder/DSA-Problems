class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> list = new ArrayList<>();
        int m = land[0].length;
        int n = land.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(land[i][j]==1)
                {
                    int col = j;
                    while(col<m && land[i][col]==1)
                    {
                        col++;
                    }
                    int row = i;
                    while(row<n && land[row][j]==1)
                    {
                        row++;
                    }
                    int lastcol = col-1;
                    int lastrow = row-1;
                    list.add(new int[]{i,j,lastrow,lastcol});
                    for(int x=i;x<=lastrow;x++)
                    {
                        for(int y=j;y<=lastcol;y++)
                        {
                            land[x][y]=0;
                        }
                    }
                }
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
