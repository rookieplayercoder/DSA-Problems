class Solution {
    public int lengthOfLongestSubstring(String s) {
      int max_count = 0;
      Map<Character,Integer> charMap = new HashMap<>();
      int left = 0;
      for(int right = 0;right<s.lenght();right++)
        {
          if(!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left)
          {
            charMap.put(s.charAt(right),right);
            max_count = Math.max(max_count,right-left+1);
          }
          else
          {
            left = charMap.get(s.charAt(right))+1;
            charMap.put(s.charAt(right),right);
          }
        }
      return max_count;
    }
}
