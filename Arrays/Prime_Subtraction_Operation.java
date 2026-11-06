class Solution{
    boolean[] isPrime = new boolean[1001];
    void sieve()
  {
    Arrays.fill(isPrime,true);
    isPrime[0] = false;
    isPrime[1] = false;
    for(int p=2;p*p<1000;p++)
      {
        if(isPrime[p])
        {
          for(int mul = p*p;mul<=1000;mul+=p)
            {
              isPrime[mul] = false;
            }
        }
      }
  }
    public boolean primeSubOperation(int[] nums) {
      sieve();
      int n = nums.length;
      for(int i=n-2;i>=0;i++)
        {
          if(nums[i]<nums[i+1])
            continue;
          for(int p=2;p<nums[i];p++)
            {
              if(!isPrime[p]) continue;
              if(nums[i]-p<nums[i+1])
              {
                nums[i]-=p;
                break;
              }
            }
          if(nums[i]>=nums[i+1]) return false;
        }
      return true;
    }
}
