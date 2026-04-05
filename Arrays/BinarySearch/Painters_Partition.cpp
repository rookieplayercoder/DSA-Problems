/*
Problem: Painter's Partition Problem

Pattern: Binary Search on Answer
Difficulty: Medium-Hard

Approach:
- We have boards and painters
- Each painter paints contiguous boards
- Goal: minimize the maximum time taken

- Search space:
    low = max(boards)   (one board minimum)
    high = sum(boards)  (one painter paints all)

- For a given maxTime:
    → count painters required
    → if painters ≤ k → try smaller time
    → else → increase time

Time Complexity: O(n * log(sum))
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;
bool isPossible(long long mid,int painter,vector<int> &C){
    long long current= 0;
    int value = 1;
    for(int x:C)
    {
        if(current+x > mid)
        {
            value++;
            current =x;
        }
        else current+=x;
    }
    return value <= painter;
}
int Solution::paint(int A, int B, vector<int> &C) {
    long long low = 0;
    long long high = 0;
    long long mod = 10000003;
    for(int x:C)
    {
        low=max(low,x);
        high+=x;
    }
    long long result= high;
    while(low<=high)
    {
        int mid = low+(high-low)/2;
        if(isPossible(mid,A,C))
        {
            result = mid;
            high = mid-1;
        }
        else low = mid+1;
    }
    return (int)((result % mod * (B % mod)) % mod);
}
