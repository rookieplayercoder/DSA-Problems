class Solution {
    public long getDescentPeriods(int[] prices) {
      int n = prices.length;
      long ans = n;
      int i=0,j=1;
      long len =1;
      while(i<n && j<n)
        {
          if(prices[j-1]-prices[j]==1)
          {
            j++;
            len++;
          }
          else
          {
            ans+=(len*(len-1))/2;
            i=j;
            j=i+1;
            len = 1;
          }
        }
      ans+=(len*(len-1)/2;
      return ans;
    }
}
