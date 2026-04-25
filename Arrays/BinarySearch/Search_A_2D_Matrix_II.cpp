/*
Problem: Search a 2D Matrix II
Link: https://leetcode.com/problems/search-a-2d-matrix-ii/

Pattern: Binary Search / Matrix Traversal
Difficulty: Medium

Approach:
- Start from top-right corner
- If current > target → move left
- If current < target → move down
- If equal → found

Time Complexity: O(n + m)
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
      int n = matrix.size();
      int m = matrix[0].size();
      int i = 0;
      int j = m-1;
      while(i<n && j>=0)
        {
          if(matrix[i][j]==target)
          {
            return true;
          }
          else if(matrix[i][j]>target)
          {
            j--
          }
          else i++;
        }
      return false;
    }
};
