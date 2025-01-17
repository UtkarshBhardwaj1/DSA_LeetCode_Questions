# Find Starting and Ending Position of a Target in Sorted Array

## Problem Statement
Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given target value.

If the target is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

---

## Examples

### Example 1:
**Input:**
```
nums = [5,7,7,8,8,10], target = 8
```
**Output:**
```
[3,4]
```

### Example 2:
**Input:**
```
nums = [5,7,7,8,8,10], target = 6
```
**Output:**
```
[-1,-1]
```

### Example 3:
**Input:**
```
nums = [], target = 0
```
**Output:**
```
[-1,-1]
```

---

## Constraints
- `0 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`
- `nums` is a non-decreasing array.
- `-10^9 <= target <= 10^9`

---

## Approach
- Use binary search to achieve `O(log n)` complexity.
- Find the starting position of the target.
- Find the ending position of the target.
