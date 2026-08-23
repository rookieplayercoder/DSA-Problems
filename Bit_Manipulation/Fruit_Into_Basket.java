class Solution
  {
    public int totalFruits(int[] fruits)
    {
      int maxCount = 0;
      int left = 0;
      Map<Integer,Integer> basket = new HashMap<>();
      for(int right = 0;right<fruits.length;right++)
        {
          basket.put(fruits[right],basket.getOrDefault(fruits[right],0)+1);
          while(basket.size()>2)
            {
              basket.put(fruits[left],basket.get(fruits[left])-1);
              if(basket.get(fruits[left])==0)
              {
                basket.remove(fruits[left]);
              }
              left++;
            }
          maxCount = Math.max(maxCount, right-left+1);
        }
      return maxCount;
    }
  }
