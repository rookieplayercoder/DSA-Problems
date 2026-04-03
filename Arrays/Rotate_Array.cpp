/*
Problem: Rotate Array
Link: https://leetcode.com/problems/rotate-array/

Pattern: Array Manipulation / Reversal
Difficulty: Medium

Approach:
- Rotate array to the right by k steps
- Use reversal method:
    1. Reverse entire array
    2. Reverse first k elements
    3. Reverse remaining elements

Time Complexity: O(n)
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        k = k%n;
        reverse(nums.begin(),nums.end());
        reverse(nums.begin(),nums.begin()+k);
        reverse(nums.begin()+k,nums.end());
        
    }
};
