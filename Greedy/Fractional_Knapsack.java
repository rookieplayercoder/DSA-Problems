class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;
        double[][] temp = new double[n][2];
        for(int i =0;i<temp.length;i++)
        {
            double ratio = (double) val[i]/wt[i];
            temp[i][0] = ratio;
            temp[i][1] = wt[i];
        }
        Arrays.sort(temp,(a, b)->Double.compare(b[0], a[0]));
        double profit = 0;
        for(int i=0;i<temp.length;i++)
        {
            if(capacity>=temp[i][1])
            {
                profit+=(temp[i][0]*temp[i][1]);
                capacity-=temp[i][1];
            }
            else if(capacity<temp[i][1])
            {
                profit+=(temp[i][0]*capacity);
                capacity = 0;
                break;
            }
        }
        return profit;
        
    }
}
