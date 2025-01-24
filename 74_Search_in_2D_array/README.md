# Search a 2D Matrix

## Problem Description
You are given an `m x n` matrix `matrix` and an integer `target`. The matrix has the following properties:
- Integers in each row are sorted from left to right.
- The first integer of each row is greater than the last integer of the previous row.

Write an efficient algorithm that searches for a value in an `m x n` matrix. This matrix has the following properties:
- Integers in each row are sorted from left to right.
- The first integer of each row is greater than the last integer of the previous row.
  
![mat](https://github.com/user-attachments/assets/c9a724ab-17c2-476b-a402-f96a2b4790fe)


**Example 1:**
`Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3 Output: true`


**Example 2:**
`Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13 Output: false`


## Solution

To solve this problem, we can treat the matrix as a flat sorted array and apply a binary search algorithm. Here's the step-by-step approach:

1. Identify the total number of elements in the matrix: `total_elements = m * n`.
2. Use binary search to determine the position of the target in the flattened array.
3. Convert the middle index of the binary search back into 2D indices to access the elements in the original matrix.

**Algorithm:**

1. Initialize `left` to 0 and `right` to `total_elements - 1`.
2. While `left` is less than or equal to `right`:
   - Calculate the middle index: `mid = left + (right - left) / 2`.
   - Convert `mid` into 2D indices: `row = mid // n` and `col = mid % n`.
   - If `matrix[row][col]` is equal to `target`, return `true`.
   - If `matrix[row][col]` is less than `target`, move `left` to `mid + 1`.
   - If `matrix[row][col]` is greater than `target`, move `right` to `mid - 1`.
3. If the loop ends without finding the target, return `false`.
