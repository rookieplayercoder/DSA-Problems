class Solution {
    public int minPlatform(int arr[], int dep[]) {
      Arrays.sort(arr);
      Arrays.sort(dep);
      int i=0;int j=0;
      int platform = 0;
      int maxPlatform  = 0;
      while(i<arr.length && j<dep.length)
        {
          if(arr[i]<=dep[j])
          {
            platform++;
            i++;
            maxPlatform = Math.max(maxPlatform,platform);
          }
          else {
          j++;
            platform--;
        }
        }
      return maxPlatform;
    }
}
