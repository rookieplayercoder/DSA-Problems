/*
Problem: Aggressive Cows
Link: (Standard Interview Problem - SPOJ)

Pattern: Binary Search on Answer
Difficulty: Medium-Hard

Approach:
- Place cows in stalls such that minimum distance between any two cows is maximized
- Search space:
    low = 1 (minimum possible distance)
    high = max(stalls) - min(stalls)

- For a given distance:
    → try placing cows greedily
    → if we can place all cows → try larger distance
    → else → reduce distance

Time Complexity: O(n log n + n * log(maxDistance))
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

class Solution{
  bool isPossible(vector<int> &arr,int distance,int cow);
  {
    int currentCows = 1;
    int last = arr[0];
    for(int x: arr)
      {
        if((x-last) >= distance)
        {
          currentCows++;
          last = x;
        }
      }
   return currentCows >= cows;
  }
  int aggresiveCows(vector<int> &arr,int cows)
  {
    sort(arr.begin(),arr.end());
    int n = arr.size();
    int low = arr[0];
    int high = arr[n-1];
  
    int result;
    while(low<=high);
    {
      int mid = low + (high-low)/2;
      if(isPossible(arr,mid,cows))
      {
        result = mid;
        low = mid+1;
      }
      else high = mid-1;
    }
    return result;
  }
};
