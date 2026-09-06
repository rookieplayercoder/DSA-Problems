class Solution
  {
     public int leastInterval(char[] tasks, int n) {
       int[] freq = new int[26];
       for(char i:freq)
         {
           freq[i-'A']++;
         }
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int i: freq)
         {
           if(i>0)
           {
             pq.offer(i);
           }
         }
       Queue<int[]> q = new LinkedList<>();
       int time = 0;
       while(!pq.isEmpty() || !q.isEmpty())
         {
           time++;
           if(!pq.isEmpty)
           {
             int f = pq.poll();
             f--;
             if(f>0)
             {
               q.offer(new int[]{f,time+n});
             }
           }
           if(!q.isEmpty() && q.peek()[1]==time)
           {
             pq.offer(q.poll()[0]);
           }
         }
       return time;
     }
  }
