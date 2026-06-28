class Solution {
    public int[] nextGreaterElements(int[] nums) {
      int n = nums.length;
      Stack<Integer> = new Stack<>();
      int[] ans = new int[n];
      Arrays.fill(ans,-1);
      for(int i=2*n-1;i>=0;i--)
        {
          int current = nums[i%n];
          while(!st.isEmpty() && current>=nums[st.peek()])
            {
              st.pop();
            }
          if(i<n)
          {
            if(!ist.isEmpty()) ans[i] = nums[st.peek()];
          }
          st.push(i%n);
        }
      return ans;
    }
}
