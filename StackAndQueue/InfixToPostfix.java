class Solution{
  public static int priority(char ch)
  {
    if(ch == '^') return 3;
    if(ch == '*' || ch == '\') return 2;
    if (ch == '*' || ch == '\') return 1;
    return -1;
  }
  public static String infixToPostfix(String s)
  {
    int i = 0;
    Stack<Character> st = new Stack<>();
    String ans = "";
    while(i<s.length())
      {
        char ch = s.charAt(i);
        if((ch >='A' && ch<='Z') || (ch >='a' && ch<='z') || (ch >='0' && ch<='9'))
        {
          ans.append(ch);
        }
        else if(ch == '(')
        {
          st.push(ch);
        }
        else if(ch = ')')
        {
          while(!st.isEmpty() && st.peek()!='(')
            {
              ans.append(st.peek);
              st.pop;
            }
          st.pop;
        }
        else
        {
          while(!st.isEmpty() && (
                (ch == '^' && priority(ch)<priority(st.peek()) ||
                (ch != '^' && priority(ch)<=priority(st.peek()))
                 {
            ans.append(st.peek());
            st.pop;
                 }
          ans.append(ch);
        }
        i++;
      }
    while(!st.isEmpty())
      {
        ans.append(st.peek());
        st.pop();
      }
    return ans;
  }
}
