class Solution {
    public long subArrayRanges(int[] nums) 
    {
        int[] pse = findPSE(nums);
        int[] nse = findNSE(nums);
        int[] pge = findPGE(nums);
        int[] nge = findNGE(nums);
        long total = 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int lefts = i - pse[i];
            int rights = nse[i] - i;
            int leftg = i - pge[i];
            int rightg = nge[i] - i;
            long minContribution = (long) lefts*rights*nums[i];
            long maxContribution = (long)leftg*rightg*nums[i];
            total+=(maxContribution-minContribution);
        }
        return total;
    }
    public int[] findNSE(int[] arr)
    {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(ans,n);
        for(int i=n-1;i>=0;i--)
        {
            int current = arr[i];
            while(!st.isEmpty() && current<=arr[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public int[] findNGE(int[] arr)
    {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(ans,n);
        for(int i=n-1;i>=0;i--)
        {
            int current = arr[i];
            while(!st.isEmpty() && current>=arr[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
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
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++)
        {
            int current = arr[i];
            while(!st.isEmpty() && current<arr[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public int[] findPGE(int[] arr)
    {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++)
        {
            int current = arr[i];
            while(!st.isEmpty() && current>arr[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}
