/*
Problem: Koko Eating Bananas
Link: https://leetcode.com/problems/koko-eating-bananas/

Pattern: Binary Search on Answer
Difficulty: Medium

Approach:
- We need minimum eating speed (k)
- Search space: [1, max(piles)]
- For each k, calculate total hours needed
- If hours <= h → try smaller k
- Else → increase k

Time Complexity: O(n * log(max(piles)))
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

bool countHours(vector<int>& arr,int speed , int k)
{
  long long count = 0;
  for(int x: arr)
    {
      count += (long long)(x + speed -1)/speed;
      if(count > k) return false ;
    }
  return count <= k;
}

int kokoEat(vector<int>& arr, int k)
{
  if(k==0) return 0;
  int low = 1;
  int high = 0;

  for(int x: arr)
    {
      high = max(high,x);
    }
  int result = high;
  while(low<=high)
    {
      int mid = low +(high-low)/2;
      if(countHours(arr,mid,k))
      {
        result = mid;
        high = mid-1;
      }
      else
      {
        low = mid+1;
      }
    }
  return result;
}
