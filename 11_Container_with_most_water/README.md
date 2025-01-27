# 11. Container With Most Water

## Difficulty: Medium

### Topics
- Arrays
- Two Pointers
- Greedy

### Problem Statement

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `i-th` line are `(i, 0)` and `(i, height[i])`.

Find two lines that, together with the x-axis, form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

**Notice that you may not slant the container.**

### Examples

#### Example 1:
![question_11](https://github.com/user-attachments/assets/9b61dfcc-5d68-44cc-afa2-4ecf611d6d09)

**Input:** `height = [1,8,6,2,5,4,8,3,7]`  
**Output:** `49`  
**Explanation:** The above vertical lines are represented by array `[1,8,6,2,5,4,8,3,7]`. In this case, the max area of water (blue section) the container can contain is `49`.

#### Example 2:

**Input:** `height = [1,1]`  
**Output:** `1`

### Constraints

- `n == height.length`
- `2 <= n <= 10^5`
- `0 <= height[i] <= 10^4`

### Approach

To solve this problem, we can use the two-pointer technique:

1. **Initialization:** Start with two pointers, one at the beginning (`left`) and one at the end (`right`) of the array.
2. **Calculate Area:** Compute the area between the two pointers by multiplying the width (distance between the pointers) and the height (minimum of the two heights at the pointers).
3. **Update Maximum Area:** Keep track of the maximum area found.
4. **Move Pointers:** Move the pointer pointing to the shorter line inward to possibly find a larger area.
5. **Loop Until Pointers Meet:** Continue the above steps until the pointers meet.

This approach ensures that you efficiently check all possible containers 
