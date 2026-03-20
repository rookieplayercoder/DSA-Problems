#include <bits/stdc++.h>
using namespace std;

/*
Problem: Two Sum
Link: https://leetcode.com/problems/two-sum/

Approach:
- Traverse array once
- Store visited elements in hashmap (value → index)
- For each element, check if (target - element) exists

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> mp;

        for(int i = 0; i < nums.size(); i++){
            int complement = target - nums[i];

            if(mp.count(complement)){
                return {mp[complement], i};
            }

            mp[nums[i]] = i;
        }

        return {};
    }
};
