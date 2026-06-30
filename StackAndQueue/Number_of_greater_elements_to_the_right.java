
class Solution {
    public static int[] count_NGE(int arr[], int indices[]) {
        // code here
        
        int m = indices.length;
        int n = arr.length;
        int[] ans = new int[m];
        int i = 0;
        while(i<m)
        {
            int count = 0;
            int target = indices[i];
            int currenti = arr[target];
            for(int j=target+1;j<n;j++)
            {
                int currenta = arr[j];
                if(currenta>currenti)
                {
                    count++;
                }
            }
            ans[i] = count;
            i++;
        }
        return ans;
    }
}
