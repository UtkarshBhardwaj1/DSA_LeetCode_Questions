# 28. Find the Index of the First Occurrence in a String

## Problem Statement

Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

### Example 1:

**Input:** haystack = "hello", needle = "ll"
**Output:** `2`
#### Explanation: The substring "ll" is found at index 2 in the string "hello".

### Example 2:
**Input:**

haystack = "aaaaa", needle = "bba"
**Output:** `-1`
#### Explanation: The substring "bba" is not found in the string "aaaaa", so the function returns -1.

### Example 3:
**Input:** haystack = "", needle = ""
**Output:**
`0`
#### Explanation: Both the haystack and needle are empty, so the first occurrence is at index 0.

#### Constraints
- `0 <= haystack.length <= 5 * 10^4`
- `0 <= needle.length <= 5 * 10^4`
Both strings consist of only lowercase English characters.
