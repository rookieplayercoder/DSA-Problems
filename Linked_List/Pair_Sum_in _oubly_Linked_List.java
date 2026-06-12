class Solution{
  public ArrayList<ArrayList<Integer>> pairsum(int target,Node head)
  {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    if(head == null) return head;
    Node left = head;
    Node right = head;
    while(right.next!=null)
      {
        right = right.next;
      }
    while(left!=right && right.next!=left)
      {
        int sum  = left.data+right.data;
        if(sum == target)
        {
          ArrayList<Integer> pair = new ArrayList<>();
          pair.add(left.data);
          pair.add(right.data);
          result.add(pair);

          left = left.next;
          right = right.prev;
        }
        else if(sum<target) left = left.next;
        else right = right.prev;
      }
    return result;
  }
}
