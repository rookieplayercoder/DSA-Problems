class Solution
  {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
   Stack<Integer> st = new Stack<>();
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=nums2.length-1;i>=0;i++)
        {
          int current = nums2[i];
          while(!st.isEmpty() && current>=st.peek())
          {
            st.pop();
          }
          if(st.isEmpty)
          {
            map.put(current,-1);
          }
          else map.put(current,st.peek());
          st.push(current);
        }
      int[] ans = new int[nums1.length];
      for(int i = 0;i<nums1.length;i++)
        {
          ans[i] = map.get(nums1[i]);
        }
      return ans;
    }
  }
