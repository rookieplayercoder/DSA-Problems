/*
Problem: Find the Nth Root of a Number

Pattern: Binary Search on Answer
Difficulty: Medium

Time Complexity: O(log m * n)
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;
#include <bits/stdc++.h>
using namespace std;

/*
Approach:
- Use Binary Search on the answer space
- Search between 1 and m
- For a mid value, check if (mid^n == m)
- If mid^n < m → move right
- If mid^n > m → move left

*/

class Solution {
  public:
  
    int check(int x, int n, int m)
    {
        long long ans = 1;
        for(int i=1;i<=n;i++)
        {
            ans = ans * x;
            if(ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }
    int nthRoot(int n, int m) {
        // Code here
        if(m==0) return 0;
        int low = 1;
        int high = m;
        
        while (low<=high)
        {
            int mid = low + (high-low)/2;
            int val = check(mid,n,m);
            
            if(val == 1)
            {
                return mid;
            }
            else if(val == 0)
            {
                low = mid+1;
            }
            else 
            {
                high = mid-1;
            }
        }
        
        return -1;
        
    }
};
