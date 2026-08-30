class Solution {
    public String minWindow(String s, String t) {
      Map<Character,Integer> map = new HashMap<>();
      for(int i=0;i<t.length();i++)
        {
          map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
      int left = 0;
      int required = t.length();
      int minLength = Integer.MAX_VALUE;
      int minStart = left;
      for(int right = 0;right<s.length();right++)
            {
              char ch = s.charAt(right);
                if(map.containsKey(ch))
                {
                    if(map.get(ch)>0)
                    {
                      required--;
                    }
                  map.put(ch,map.get(ch)-1);
                }
              while(required==0)
                  {
                    char leftChar = s.charAt(left);
                    if(minLength>right-left+1)
                      {
                        minLength = right-left+1;
                        minStart = left;
                      }
                    if(map.containsKey(leftChar))
                      {
                        map.put(leftChar,map.get(leftChar)-1);
                        if(map.get(leftChar)>0)
                          {
                            required++;
                          }
                      }
                    left++;
                  }
            }
      if(minLength==Integer.MAX_VALUE) return "";
      return s.substring(minstart,minstart+minLnegth);
    }
}
