/*
Problem: Capacity To Ship Packages Within D Days
Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

Pattern: Binary Search on Answer
Difficulty: Medium

Approach:
- We need minimum ship capacity such that all packages can be shipped within D days
- Search space:
    low = max(weights)  (minimum possible capacity)
    high = sum(weights) (maximum possible capacity)

- For a given capacity:
    → simulate shipping
    → count days required
    → if days ≤ D → try smaller capacity
    → else → increase capacity

Time Complexity: O(n * log(sum))
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

int shipWithinDays(vector<int>& weights, int days){
  int low = 0;
  int high = 0;
  for(int x:weights)
    {
      low = max(low,x);
    }
  for(int x: weights)
    {
      high+=x;
    }
  int result = high;
  while(low<=high)
    {
      int mid = low + (high-low)/2;
      int currentWeight = 0;
      int daysNeeded =1;
      for(int w: weights)
        {
          if(currentWeight + w > mid)
          {
            daysNeeded++;
            currentWeight=0;
          }
          else currentWeight+=w;
        }
      if(daysNeeded <= days)
      {
        result = mid;
        high = mid-1;
      }
      else low = mid+1;
    }
  return result;
};
