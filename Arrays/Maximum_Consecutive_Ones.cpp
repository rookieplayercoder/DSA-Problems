/*
Problem: Maximum Consecutive Ones
Link: https://leetcode.com/problems/max-consecutive-ones/

Pattern: Array / Counting
Difficulty: Easy

Approach:
- Traverse array
- Count consecutive 1s
- Reset count when 0 appears
- Track maximum count

Time Complexity: O(n)
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

int findMaxConsecutiveOnes(vector<int>& nums) {
    int count = 0, maxCount = 0;

    for(int num : nums) {
        if(num == 1) {
            count++;
            maxCount = max(maxCount, count);
        } else {
            count = 0;
        }
    }

    return maxCount;
}

int main() {
    vector<int> nums = {1,1,0,1,1,1};

    cout << findMaxConsecutiveOnes(nums);
    return 0;
}
