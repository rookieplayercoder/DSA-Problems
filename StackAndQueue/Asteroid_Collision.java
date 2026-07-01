class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;
        for(int i=0;i<n;i++)
        {
            boolean alive =true;
            int current = asteroids[i];
            while(!st.isEmpty() && current<0 && st.peek()>0)
            {
                if(Math.abs(current)>st.peek())
                {
                    st.pop();
                    continue;
                }
                else if(Math.abs(current)== st.peek())
                {
                    st.pop();
                    alive =false;
                    break;
                }
                else {
                    alive = false;
                    break;
                }
            }
            if(alive)
            {
               st.push(asteroids[i]);
            }
        }
        int[] ans = new int[st.size()];
        for(int i=ans.length-1;i>=0;i--)
        {
            ans[i]=st.pop();
        }
        return ans;
    }
}
