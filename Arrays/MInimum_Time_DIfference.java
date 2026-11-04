class Solution {
    public int findMinDifference(List<String> timePoints) {
      int n = timePoints.size();
      int[] minu = new int[n];
      for(int i=0;i<n;i++)
        {
          String time = timePoints.get(i);
          String[] arr = time.split(":");
          int hours = Integer.parseInt(arr[0]);
          int minutes = Integer.parseInt(arr[1]);
          int total = hours*60+minutes;
          minu[i] = total;
        }
      Arrays.sort(minu);
      int minimum = 1440-minu[n-1]+minu[0];
      for(int i=1;i<n;i++)
        {
          minimum = Math.min(minimum,minu[i]-minu[i-1]);
        }
      return minimum;
    }
}
