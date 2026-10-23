class Solution{
  public List<List<Integer>> groupThePeople(int[] groupSizes) {
    List<Integer<Integer>> temp = new ArrayList<>();
    Map<List,List<Integer>> map = new HashMap<>();
    for(int i=0;i<groupSizes.length;i++)
      {
        int size = groupSizes[i];

        map.putIfAbsent(size,new ArrayList<>());
        List<Integer> current = map.get(size);

        current.add(i);
        if(current.size()==size)
        {
          temp.add(new ArrayList<>(current));
          current.clear();
        }
      }
    return temp;
  }
}
