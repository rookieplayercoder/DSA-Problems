class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
      List<Integer> list = new ArrayList<>();
      String digits= "123456789";
      int lowlen = String.valueOf(low).length();
      int highlen = String.valueOf(high).length();
      for(int i=lowlen;i<=highlen;i++)
        {
          for(int j=0;j+i<=digits.length();j++)
            {
              int ans = Integer.parseInt(digits.substring(j,j+i);
              if(ans>=low && ans <= high) list.add(ans);
            }
        }
      return list;
    } 
}
