/*
Problem: Search a 2D Matrix
Link: https://leetcode.com/problems/search-a-2d-matrix/

Pattern: Binary Search
Difficulty: Medium

Approach:
- Treat matrix as a single sorted array
- Index mapping:
    row = mid / m
    col = mid % m

Time Complexity: O(log(n*m))
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
      int n = matrix.size();
      int m = matrix[0].size();
      for(int i=0;i<n;i++)
        {
          int j = m-1;
          while(j>=0)
            {
              if(matrix[i][j]==target)
              {
                return true;
              }
              else j--;
            }
        }
      return false;
    }
};
