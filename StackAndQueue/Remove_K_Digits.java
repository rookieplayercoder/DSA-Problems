class Solution {
    public String removeKdigits(String num, int k) {
      Stack<Character> st = new Stack<>();
      for(int i = 0;i<num.length();i++)
          {
            int digit = num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>digit)
              {
                st.pop();
                k--;
              }
          }
      while(k>0 && !st.isEmpty())
      {
        st.pop();
        k--;
      }
      if(st.isEmpty()) return "0";
      StringBuilder sb = new StringBuilder();
      while(!st.isEmpty())
        {
          sb.append(st.pop());
        }
      sb.reverse();
      int nonzero = 0;
      while(nonzero < sb.length() && sb.charAt(nonzero) == '0')
        {
        nonzero++;
        }
      String result = sb.substring(nonzero);
      return result.isEmpty() ? "0" : result;
    }
}
