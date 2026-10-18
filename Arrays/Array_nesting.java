class Solution {
    public int arrayNesting(int[] nums){
      int n = nums.length;
      boolean[] visited = new boolean[n];
      int length = 0;
      for(int i=0;i<n;i++)
        {
          int count = 0;
          int curr = i;
          while(!visited[curr])
            {
              visited[curr] = true;
              count++;
              curr = visited[curr];
            }
          length = Math.max(length,count);
        }
      return length;
    }
}
  
