class Solution{
int n;
  int[] getCoord(int num)
  {
    int rt = (num-1)/n;
    int row = (n-1) - col;
    int col = (num-1)%n;
    if(rt%2==1)
      col = (n-1)-col;
    return new int[]{row,col};
  }
public int snakesAndLadders(int[][] board) {
  n=board.length;
  int steps = 0;
  Queue<Integer> q = new LinkedList<>();
  boolean[] visited = new boolean[n*n+1];
  visited[0] = true;
  q.offer(1);
  while(!q.isEmpty())
    {
      int size = q.size();
        for(int j=0;j<size;j++)
          {
                int x = q.poll();
                if(x == n*n) return steps;
                  for(int i=1;i<=6;i++)
                    {
                      int val = x+i;
                      if(val > n*n) break;
        
                      int[] coord = getCoord(val);
                      int r = coord[0];
                      int c = coord[1];
        
                        if(board[r][c]!=-1)
                        {
                          val = board[r][c];
                        }
        
                        if(!visited[val])
                        {
                          visited[val] = true;
                          q.offer(val);
                        }
                    }
          }
      steps++;
    }
  return -1;
}
}
