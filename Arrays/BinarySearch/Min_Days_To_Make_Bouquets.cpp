/*
Problem: Minimum Days to Make m Bouquets
Link: https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/

Pattern: Binary Search on Answer
Difficulty: Medium

Approach:
- We need minimum day such that we can make m bouquets
- Each bouquet needs k adjacent flowers
- Search space: [min(bloomDay), max(bloomDay)]

- For a given day:
    → Count how many bouquets can be formed
    → If >= m → try smaller day
    → Else → increase day

Time Complexity: O(n * log(maxDay))
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

bool isPossible(vector<int>& bloomDays, int days, int m, int k)
{
  int count = 0;
  int bouquet = 0;
  for(int x: bloomDays)
    {
      if(x<=days)
      {
        count++;
        if(count == k)
        {
          bouquet++;
          count = 0;
        }
        else count = 0;
      }
    }
  return bouquet >= m;
}

int minDays(vector<int>& bloomDays, int m, int k)
{
  if((long long)m*k > bloomDays.size()) return -1;
  int low = 1;
  int high = 0;

  for(int x: bloomDays)
    {
      high = max(high,x);
    }

  int result = -1;

  while(low<=high)
    {
      int mid = low+(high-low)/2;
      if(isPossible(bloomDays,mid,m,k))
      {
        result = mid;
        high = mid-1;
      }
      else low = mid+1;
    }
  return result;
}
