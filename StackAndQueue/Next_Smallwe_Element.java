class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
      Stack<Integer> st = new Stack<>();
      ArrayList<Integer> ans = new ArrayList<>();
      int n = arr.length;
      for(int i=0;i<n;i++)
        {
          ans.add(-1);
        }
      for(int i=n-1;i>=0;i--)
        {
          current = arr[i];
          while(!st.isEmpty() && current >= arr[st.peek()])
            {
              st.pop();
            }
          if(!st.isEmpty())
          {
            ans.set(i,arr[st.peek()]);
          }
          st.push(i);
        }
      return ans;
    }
}
