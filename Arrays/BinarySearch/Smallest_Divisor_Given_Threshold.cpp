/*
Problem: Find the Smallest Divisor Given a Threshold
Link: https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/

Pattern: Binary Search on Answer
Difficulty: Medium

Approach:
- We need the smallest divisor such that:
    sum of ceil(nums[i] / divisor) ≤ threshold

- Search space: [1, max(nums)]

- For each divisor:
    → compute sum using ceil division
    → if sum ≤ threshold → try smaller divisor
    → else → increase divisor

Time Complexity: O(n * log(max(nums)))
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int smallestDivisor(vector<int>& nums, int threshold){
      int low = 1;
      int high = 0;

      for(int x: nums)
        {
          high = max(high, x);
        }
      int result;
      while(low<=high)
        {
          int mid = low + (high-low)/2;
          int sum = 0;
          for(int x: nums)
            {
              sum += (x+mid-1)/mid;
            }
          if(sum <= threshold)
          {
            result = mid;
            high = mid-1;
          }
          else low = mid+1;
        }
      return result;
        };
