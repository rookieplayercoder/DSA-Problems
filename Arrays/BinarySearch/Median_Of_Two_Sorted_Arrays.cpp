/*
Problem: Median of Two Sorted Arrays
Link: https://leetcode.com/problems/median-of-two-sorted-arrays/

Pattern: Binary Search on Partition
Difficulty: Hard

Approach:
- We partition both arrays such that:
    left part size = right part size
- Ensure:
    max(left1, left2) <= min(right1, right2)

- Always binary search on smaller array

Time Complexity: O(log(min(n, m)))
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2)(
        if(nums1.size()>nums2.size()) return findMedianSortedArrays(nums2,nums1);
        int n1=nums1.size();int n2=nums2.size();
        int low = 0;int high = n1;
        int left = (n1+n2+1)/2;
        int n = n1+n2;
        while(low<=high)
        {
          int mid1 = low+(high-low)/2;
          int high = left-mid1;
          int l1=INT_MIN;int l2=INT_MIN;
          int r1=INT_MAX;int r2=INT_MAX;
          if(mid1<n1) r1 = nums1[mid1];
          if(mid2<n2) r2 = nums2[mid2];
          if(mid1-1 >= 0) l1 = nums1[mid1-1];
          if(mid2-1>=0) l2 = nums2[mid2-1];
          if(l1<=r2 && l2<=r1)
            {
            if(n%2==0) 
              {
                return (max(l1,l2)+min(r1,r2))/2.0
              }
            else return max(l1,l2);
            }
          else if(l1>r2)
             {
               high = mid1-1;
             }
          else low = mid1+1;
        }
       return 0.0;
    )
};
