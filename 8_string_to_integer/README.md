# 8. String to Integer (atoi)

**Difficulty**: Medium  
**Status**: Solved  

## Problem Description

Implement the `myAtoi(string s)` function, which converts a string to a 32-bit signed integer.

### Algorithm

1. **Whitespace Handling**: Ignore any leading whitespace (`" "`).
2. **Signedness**: Check the next character for `'-'` or `'+'`. Assume positivity if neither is present.
3. **Conversion**:
   - Read the integer by skipping leading zeros.
   - Stop when encountering a non-digit character or reaching the end of the string.
   - If no digits are read, return `0`.
4. **Boundary Check**:
   - If the integer is less than `-2^31`, round to `-2^31`.
   - If the integer exceeds `2^31 - 1`, round to `2^31 - 1`.

### Constraints

- `0 <= s.length <= 200`
- `s` consists of English letters (lower-case and upper-case), digits (`0-9`), `' '`, `'+'`, `'-'`, and `'.'`.

## Examples

### Example 1
**Input**:  
`s = "42"`  
**Output**:  
`42`  
**Explanation**:  
- No leading whitespace or signs detected.  
- The string `"42"` is read in as the integer `42`.  

### Example 2
**Input**:  
`s = "   -042"`  
**Output**:  
`-42`  
**Explanation**:  
- Leading whitespace is ignored.  
- The `'-'` indicates the number is negative.  
- The integer `042` is read, ignoring leading zeros, resulting in `-42`.  

### Example 3
**Input**:  
`s = "1337c0d3"`  
**Output**:  
`1337`  
**Explanation**:  
- The string `"1337"` is read until a non-digit character (`'c'`) is encountered.  

### Example 4
**Input**:  
`s = "0-1"`  
**Output**:  
`0`  
**Explanation**:  
- The integer `0` is read, stopping before the `'-'`.  

### Example 5
**Input**:  
`s = "words and 987"`  
**Output**:  
`0`  
**Explanation**:  
- Reading stops at the first non-digit character `'w'`.  

## Notes

- The function ensures the output always falls within the 32-bit signed integer range `[-2^31, 2^31 - 1]`.

## Topics
- String Manipulation
- Edge Case Handling

---
