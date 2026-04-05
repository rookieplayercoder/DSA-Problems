/*
Problem: Kth Element of Two Sorted Arrays
Link: (Standard Interview Problem)

Pattern: Binary Search on Partition
Difficulty: Hard

Approach:
- Similar to median problem
- We partition arrays such that:
    left part contains exactly k elements

- Ensure:
    max(left1, left2) <= min(right1, right2)

- Always binary search on smaller array

Time Complexity: O(log(min(n, m)))
Space Complexity: O(1)
*/
#include <bits/stdc++.h>
using namespace std;

int kthElement(vector<int>& a, vector<int>& b, int k){
  if(a.size()>b.size()) return kthElement(b,a,k);
  int n1 = a.size();int n2=b.size();
  int low=max(0,k-n1);int high=min(k,n1);
  int n=n1+n2;
  while(low<=high)
    {
      int mid1 = low+(high-low)/2;
      int mid2 = k-mid1;
      int l1=INT_MIN;int l2=INT_MIN;
      int r1=INT_MAX;int r2=INT_MAX;
      if(mid1<n1) r1=a[mid1];
      if(mid1<n2) r2=b[mid2];
      if(mid1-1>=0) l1=a[mid1-1];
      if(mid2-1>=0) l2=b[mid2-1];
      if(l1<=r2 && l2<=r1)
      {
        return max(l1,l2);
      }
      else if(l1>r2) high = mid-1;
      else low = mid+1;
    }
  return 0;
}
