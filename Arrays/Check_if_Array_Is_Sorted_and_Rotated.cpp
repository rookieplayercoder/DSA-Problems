/*
Problem: Check if Array Is Sorted and Rotated
Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

Pattern: Array / Observation
Difficulty: Easy

Approach:
- Count how many times order breaks (nums[i] > nums[i+1])
- Also check last element with first (circular condition)
- If breaks ≤ 1 → valid sorted & rotated array

Time Complexity: O(n)
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool check(vector<int>& nums) 
    {
        int count = 0;
        int n = nums.size();
        for(int i=0;i<n;i++)
        {
            if(nums[i]>nums[(i+1)%n])
            {
                count++;
            }
            if(count >1)
            {
                return false;
            }
        }
        return true;

        
    }
};
