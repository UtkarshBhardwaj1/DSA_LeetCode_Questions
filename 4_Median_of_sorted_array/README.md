# Median of Two Sorted Arrays

## Problem Statement

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return the median of the two sorted arrays.

The overall runtime complexity should be O(log (m+n)).

### Example 1:
**Input:**
```plaintext
nums1 = [1,3], nums2 = [2]
Output:

plaintext
Copy code
2.00000
Explanation: Merged array = [1,2,3] and the median is 2.

Example 2:
Input:

plaintext
Copy code
nums1 = [1,2], nums2 = [3,4]
Output:

plaintext
Copy code
2.50000
Explanation: Merged array = [1,2,3,4] and the median is (2 + 3) / 2 = 2.5.

Constraints
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-10^6 <= nums1[i], nums2[i] <= 10^6
