# Group Anagrams

## Problem Statement
Given an array of strings `strs`, group the anagrams together. You can return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

---

## Examples

### Example 1:
**Input:**
```
strs = ["eat","tea","tan","ate","nat","bat"]
```
**Output:**
```
[["bat"],["nat","tan"],["ate","eat","tea"]]
```

### Example 2:
**Input:**
```
strs = [""]
```
**Output:**
```
[[""]]
```

### Example 3:
**Input:**
```
strs = ["a"]
```
**Output:**
```
[["a"]]
```

---

## Constraints
- `1 <= strs.length <= 10^4`
- `0 <= strs[i].length <= 100`
- `strs[i]` consists of lowercase English letters.

---

## Approach
### Key Idea:
Use a hashmap to group strings that are anagrams of each other. The key for the hashmap can be:
1. A sorted version of the string.
2. A frequency count of the characters.
