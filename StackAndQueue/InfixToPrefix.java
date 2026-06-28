class Solution {
    public static int priority(char ch)
    {
    if(ch == '^') return 3;
    if(ch == '*' || ch == '/') return 2;
    if (ch == '-' || ch == '+') return 1;
    return -1;
  }
    static String infixToPre(String s) {
        // code here
        for(int i = 0;i<s.length();i++)
          {
            char re = s.charAt(i);
            if(re == '(') reversedInput.append(')');
            else if(re == ')') reversedInput.append('(');
            else reversedInput.append(re);
          }
        String tummy = reversedInput.toString();
        int i = 0;
        Stack<Character> st = new Stack<>();
        StringBuilder ans =new StringBuilder();
        while(i<tummy.length())
        {
            char ch = tummy.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch >= '0' && ch<='9'))
            {
                ans.append(ch);
            }
            else if(ch == '(')
            {
                st.push(ch);
            }
            else if(ch == ')')
            {
                if(!st.isEmpty() && st.peek()!='(')
                {
                    ans.append(st.peek());
                    st.pop();
                }
                st.pop();
            }
            else 
            {
                while(!st.isEmpty() && 
                ((ch == '^' && priority(ch)<=priority(st.peek())) || 
                (ch !='^' && priority(ch)<priority(st.peek()))))
                {
                    ans.append(st.peek());
                    st.pop();
                }
                st.push(ch);
            }
            i++;
        }
        while(!st.isEmpty())
        {
           ans.append(st.peek());
           st.pop();
        }
        ans = new StringBuilder().reverse().toString();
        return ans;
    }
}
