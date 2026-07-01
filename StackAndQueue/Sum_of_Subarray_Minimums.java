class Solution {
    public int sumSubarrayMins(int[] arr) {
      int[] nse = findNSE(arr);
      int[] pse = findPSE(arr);
      int n = arr.length;
      long total = 0;
      long mod = 1_000_000_007;
      for(int i=0;i<n;i++)
        {
          int left = i - pse[i];
          int right = nse[i] - i;
          total = (total +((((left*right)%mod)*arr[i])%mod))%mod;
        }
      return (int)total;
    }
  public int[] findNSE(int[] arr)
  {
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[];
    Arrays.fill(ans,n);
    for(int i = n-1;i>=0;i--)
      {
        while(!st.isEmpty() && current<=arr[st.peek()])
        {
          st.pop();
        }
        if(!st.isEmpty)
        {
          ans[i] = st.peek();
        }
        st.push(i);
      }
    return ans;
  }
   public int[] findPSE(int[] arr)
  {
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[];
    Arrays.fill(ans,-1);
    for(int i = 0;i<n;i++)
      {
        while(!st.isEmpty() && current<arr[st.peek()])
        {
          st.pop();
        }
        if(!st.isEmpty)
        {
          ans[i] = st.peek();
        }
        st.push(i);
      }
    return ans;
}
