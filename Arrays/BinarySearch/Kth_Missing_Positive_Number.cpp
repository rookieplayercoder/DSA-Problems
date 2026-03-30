/*
Problem: Kth Missing Positive Number
Link: https://leetcode.com/problems/kth-missing-positive-number/

Pattern: Binary Search
Difficulty: Easy-Medium

Approach:
- For index i, missing numbers = arr[i] - (i + 1)
- Use binary search to find first index where missing ≥ k
- Answer = k + index

Time Complexity: O(log n)
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
int findKthPositive(vector<int> arr, int k){
  int low=0;
  int high = arr.size()-1;
  int result=0;
  while(low<=high)
    {
      int mid = low + (high-low)/2;
      int misssing = arr[mid]-(mid+1);

      if(missing<k)
      {
        low = mid+1;
      }
      else high = mid-1;
    }
  return result = low + k;
}
  
};
