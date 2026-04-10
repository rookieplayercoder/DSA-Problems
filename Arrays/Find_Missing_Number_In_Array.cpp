/*
Problem: Missing Number
Link: https://leetcode.com/problems/missing-number/

Pattern: Math
Difficulty: Easy

Approach:
- Use sum formula: n*(n+1)/2
- Subtract actual sum from expected sum

Time Complexity: O(n)
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

int missingNumber(vector<int>& nums) {
    int n = nums.size();

    int expectedSum = n * (n + 1) / 2;
    int actualSum = 0;

    for(int num : nums) {
        actualSum += num;
    }

    return expectedSum - actualSum;
}

int main() {
    vector<int> nums = {3,0,1};

    cout << missingNumber(nums);
    return 0;
}
