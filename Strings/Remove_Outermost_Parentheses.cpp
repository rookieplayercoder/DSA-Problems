/*
Problem: Remove Outermost Parentheses
Link: https://leetcode.com/problems/remove-outermost-parentheses/

Pattern: Strings / Parentheses
Difficulty: Easy

Approach:
- Use a counter to track depth of parentheses
- Ignore:
    → first '(' of every primitive
    → last ')' of every primitive

Time Complexity: O(n)
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    string removeOuterParentheses(string s) {
      string result;
      int balance = 0;
      for(int i=0;i<s.size();i++)
        {
            if(string == 's')
            {
              if(balance<0)
              {
                result+=s[i];
              }
            balance++;
            }
            else
            {
              balance--;
              if(balace>0)
              {
                result+=s[i];
              }
          }
          return result;
        }
    };
