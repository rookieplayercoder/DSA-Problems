class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int n = bt.length;
        int[] wt = new int[n];
        int last = 0;
        for(int i=0;i<n-1;i++)
        {
            last+=bt[i];
            wt[i] = last;
        }
        int sum = 0;
        for(int c: wt)
        {
            sum+=c;
        }
        return sum/n;
    }
}
