class Solution{
  public int characterReplacement(String s)
  {
    int left = 0;
    int maxCount = 0;
    int maxfreq = 0;
    Map<Character,Integer> map = new HashMap<>();
    for(int right = 0;right<s.length();right++)
      {
        map.put(s.charAt(right),map.getOrDefault(s.charAt(right))+1);
        maxfreq = Math.max(maxfreq,map.get(s.charAt(right)));
        while((right-left+1)-maxfreq > k)
          {
            map.put(s.charAt(left),map.get(s.charAt(left))-1);
            left++;
          }
        maxCount = Math.max(maxCount,right-left+1);
      }
    return maxCount;
  }
}
