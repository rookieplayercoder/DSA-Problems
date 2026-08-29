class Solution{
  public int numberOfSubstrings(String s) {
    int lastA = -1;
    int lastB = -1;
    int lastC = -1;
    int count = 0;
    for(int right = 0;right<s.length();right++)
      {
        if(s.charAt(right)=='a') lastA = right;
        else if(s.charAt(right) == 'b') lastB = right;
        else lastC = right;
        count+=Math.min(lastA,Math.min(lastB,lastC));
      }
    return count;
  }
}
