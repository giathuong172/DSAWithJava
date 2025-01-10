package array_string_problem;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharacters {
    /*
    Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
*/
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int longest = 0;
        HashSet<Character> set = new HashSet();
        for(int right = 0;right < s.length();right++){
            char c = s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            longest = Math.max(longest,right-left+1);
            set.add(c);
        }
        return longest;
    }
}
