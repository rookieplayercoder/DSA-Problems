/*
Problem: Allocate Minimum Number of Pages
Link: (Standard Interview / GFG Problem)

Pattern: Binary Search on Answer
Difficulty: Medium-Hard

Approach:
- We need to allocate books to students such that:
    → each student gets contiguous books
    → maximum pages assigned to a student is minimized

- Search space:
    low = max(pages)  (at least one book)
    high = sum(pages) (one student takes all)

- For a given maxPages:
    → check how many students are needed
    → if students ≤ m → try smaller maxPages
    → else → increase maxPages

Time Complexity: O(n * log(sum))
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

class Solution{
   public:
   bool isPossible(vector<int> arr,int pages,int k)
{
  long long currentPages = 0;
  int student = 1;
  for(int x: arr)
    {
      if(currentPages+x > pages)
      {
        student++;
        currentPages=x;
      }
      else currentPages+=x;
    }
  return student<=k;
}
   int findPages(vector<int> arr,int k)
{
   if(arr.size()<k) return -1;
   int low = 0;
   int high = 0;
   for(int x: arr)
  {
    low = max(low,x);
    high+=x;
  }
  int result = -1;
  while(low<=high)
    {
      int mid = low+(high-low)/2;
      if(isPossible(arr,mid,k))
      {
        result = mid;
        high = mid-1;
      }
      else low = mid+1;
    }
  return result;
}
};
