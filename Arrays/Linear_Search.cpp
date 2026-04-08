/*
Problem: Linear Search

Pattern: Basics / Array Traversal
Difficulty: Easy

Approach:
- Traverse the array from start to end
- Compare each element with target
- If found → return index
- Else → return -1

Time Complexity: O(n)
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

int linearSearch(vector<int>& arr, int target) {
    for(int i = 0; i < arr.size(); i++) {
        if(arr[i] == target) {
            return i; // index found
        }
    }
    return -1; // not found
}

int main() {
    vector<int> arr = {10, 20, 30, 40, 50};
    int target = 30;

    int result = linearSearch(arr, target);

    if(result != -1)
        cout << "Element found at index: " << result;
    else
        cout << "Element not found";

    return 0;
}
