class Solution {
    public boolean handOfStraight(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums)
        {
            if(map.containsKey(i))
            {
                pq.offer(i);
            }
        }

        while(!map.isEmpty())
        {
            int face = pq.peek();
            for(int i=0;i<k;i++)
            {
                int card = face+i;
                if(!map.containsKey(card)) return false;

                map.put(card,map.get(card)-1);

                if(map.get(card)==0) map.remove(card);
            }
            while(!pq.isEmpty() && !map.containsKey(pq.peek()))
            {
                pq.poll();
            }
        }
        return true;
    }
}
