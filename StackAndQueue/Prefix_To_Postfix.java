class Solution {
    static String preToPost(String s) {
        // code here
        int i = s.length()-1;
        Stack<String> st = new Stack<>();
        while(i>=0)
                {
                    char ch = s.charAt(i);
                     if((ch >='A' && ch<='Z') || (ch >='a' && ch<='z') || (ch >='0' && ch<='9'))
                  {
                       st.push(String.valueOf(ch));
                  }
                  else {
                      String t1 = st.peek();
                      st.pop();
                      String t2 = st.peek();
                      st.pop();
                      String ans =t1 + t2 + ch;
                      st.push(ans);
                  }
                  i--;
            
                }
                return st.peek();
    }
}
