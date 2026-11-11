class Solution {
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> list = new ArrayList<>();
        int MOD = 1_000_000_007;
        for(int i=0;i<31;i++)
        {
            if((n&(1<<i)) !=0) list.add(i);
        }

        int[] prefix = new int[list.size()+1];
        for(int i=0;i<list.size();i++)
        {
            prefix[i+1]=prefix[i]+list.get(i);
        }

        int[] res = new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int left = queries[i][0];
            int right = queries[i][1];

            int total = prefix[right+1]-prefix[left];

            res[i] = power(2,total,MOD);
        }
        return res;
    }
    private int power(long base,int exp,int mod)
    {
        long result = 1;
        base%=mod;
        while(exp>0)
        {
            if((exp & 1)==1) result = (result*base)%mod;
            base = (base*base)%mod;
            exp>>=1;
        }
        return (int)result;
    }
}
