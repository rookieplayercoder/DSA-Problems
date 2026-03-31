/*
Problem: Pascal's Triangle
Link: https://leetcode.com/problems/pascals-triangle/

Pattern: Arrays / DP
Difficulty: Easy

Approach:
- First and last element of every row is 1
- Other elements:
    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j]

Time Complexity: O(n^2)
Space Complexity: O(n^2)
*/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> generateRow(int n)
    {
        long long ans=1;
        vector<int> ansRow;
        ansRow.push_back(1);
        for(int i=1;i<n;i++)
        {
            ans = ans*(n-i);
            ans = ans/i;
            ansRow.push_back(ans);
        }
        return ansRow;
    }
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> result;
        for(int i=1;i<=numRows;i++)
        {
            result.push_back(generateRow(i));
        }
        return result;
    }
};
