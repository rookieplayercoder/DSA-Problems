class Solution {
    static String preToInfix(String s) {
      int i = 0;
      Stack<String> st = new Stack<>();
      while(i<s.length())
        {
          char ch = s.charAt(i);
          if((ch >='A' && ch<='Z') || (ch >='a' && ch<='z') || (ch >='0' && ch<='9'))
        {
          st.push(String.valueOf(ch));
        }
          else 
          {
            String t1 = st.peek();
            st.pop();
            String t2 = st.peek();
            st.pop();
            String ans = '(' + t2 + ch + t1 + ')';
            st.push(ans);
          }
          i++;
        }
      return st.peek();
    }
}
