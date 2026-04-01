/*
Problem: Split Array Largest Sum
Link: https://leetcode.com/problems/split-array-largest-sum/

Pattern: Binary Search on Answer
Difficulty: Hard

Approach:
- Split array into k subarrays such that the largest sum is minimized

- Search space:
    low = max(nums)      (minimum possible max sum)
    high = sum(nums)     (maximum possible max sum)

- For a given maxSum:
    → count how many subarrays are needed
    → if count ≤ k → try smaller maxSum
    → else → increase maxSum

Time Complexity: O(n * log(sum))
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  bool isPossible(vector<int>& nums,int value,int k)
{
  long long currentPages = 0;
  int parts = 1;
  for(int x: nums)
    {
      if(currentPages+x > value)
      {
        parts++;
        currentPages=x;
      }
      else currentPages+=x;
    }
  return parts <= k;
}
  int splitArray(vector<int>& nums,int k)
  {
    int low = 0;
    int high = 0;
    for(int x: nums)
      {
        low = max(low,x);
        high+=x;
      }
    int result;
    while(low<=high)
      {
        int mid = low+(high-low)/2;
        if(isPossible(nums,mid,k))
        {
          result = mid;
          high = mid-1;
        }
        else low = mid+1;
      }
    return result;
  }
};
