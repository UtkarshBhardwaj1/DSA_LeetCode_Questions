# Sqrt(x)

## Problem Statement
Given a non-negative integer `x`, compute and return the square root of `x`.

Since the return type is an integer, the decimal digits are **truncated**, and only the integer part of the result is returned.

---

## Examples

### Example 1:
**Input:**
```
x = 4
```
**Output:**
```
2
```

### Example 2:
**Input:**
```
x = 8
```
**Output:**
```
2
```
**Explanation:**
```
The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
```

---

## Constraints
- `0 <= x <= 2^31 - 1`

---

## Approach
### Key Idea:
Use binary search to find the integer square root of `x`. The square root of `x` lies between `0` and `x`. Binary search efficiently narrows down this range.
