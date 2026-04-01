/*
Problem: Remove Duplicates from Sorted Array
Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

Pattern: Two Pointers
Difficulty: Easy

Approach:
- Use two pointers:
    i → last unique element index
    j → current element

- If nums[j] != nums[i], move i forward and update nums[i]

Time Complexity: O(n)
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

int removeDuplicates(vector<int>& nums) {
    if(nums.size() == 0) return 0;

    int i = 0;

    for(int j = 1; j < nums.size(); j++) {
        if(nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }

    return i + 1;
}

int main() {
    vector<int> nums = {1,1,2,2,3,3,4};

    int k = removeDuplicates(nums);

    cout << "Unique count: " << k << endl;

    for(int i = 0; i < k; i++) {
        cout << nums[i] << " ";
    }

    return 0;
}
