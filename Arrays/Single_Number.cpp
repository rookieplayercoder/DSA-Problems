/*
Problem: Single Number
Link: https://leetcode.com/problems/single-number/

Pattern: Bit Manipulation (XOR)
Difficulty: Easy

Approach:
- XOR all elements
- Duplicate numbers cancel out
- Only single number remains

Time Complexity: O(n)
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

int singleNumber(vector<int>& nums) {
    int result = 0;

    for(int num : nums) {
        result ^= num;
    }

    return result;
}

int main() {
    vector<int> nums = {4,1,2,1,2};

    cout << singleNumber(nums);
    return 0;
}
