/*
Problem: Move Zeroes
Link: https://leetcode.com/problems/move-zeroes/

Pattern: Two Pointers
Difficulty: Easy

Approach:
- Maintain a pointer (i) for placing non-zero elements
- Traverse array with j:
    → If nums[j] != 0, swap with nums[i] and increment i

Time Complexity: O(n)
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int n = nums.size();
        vector<int> temp;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                temp.push_back(nums[i]);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                temp.push_back(nums[i]);
            }
        }

        nums = temp;

    }
};
