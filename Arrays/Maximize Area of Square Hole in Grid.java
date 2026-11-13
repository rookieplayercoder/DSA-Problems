class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int maxH = 1,maxV = 1;
        int countH = 1,countV =1;
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        for(int i=1;i<hBars.length;i++)
        {
            if(hBars[i]-hBars[i-1]==1)
            {
                countH++;
            }
            else
            {
                countH=1;
            }
            maxH = Math.max(countH,maxH);
        }
        for(int i=1;i<vBars.length;i++)
        {
            if(vBars[i]-vBars[i-1]==1)
            {
                countV++;
            }
            else
            {
                countV=1;
            }
            maxV = Math.max(countV,maxV);
        }
        int side = Math.min(maxH,maxV)+1;
        return side*side;
    }
}
