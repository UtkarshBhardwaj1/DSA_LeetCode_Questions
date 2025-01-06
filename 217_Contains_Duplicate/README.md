# Contains Duplicate

## Problem Statement
Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

---

## Examples

### Example 1:
**Input:**
```
nums = [1,2,3,1]
```
**Output:**
```
true
```

### Example 2:
**Input:**
```
nums = [1,2,3,4]
```
**Output:**
```
false
```

### Example 3:
**Input:**
```
nums = [1,1,1,3,3,4,3,2,4,2]
```
**Output:**
```
true
```

---

## Constraints
- `1 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`

---

## Approach
### Key Idea:
Use a hash set to store numbers as we iterate through the array. If a number is already in the set, return `true`. Otherwise, add the number to the set.

