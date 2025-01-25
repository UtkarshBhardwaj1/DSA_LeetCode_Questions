class Solution {
    public int countPalindromicSubsequence(String s) {
        int count = 0;
        int n = s.length();
        
        // Iterate for each character 'a' to 'z'
        for (char c = 'a'; c <= 'z'; c++) {
            int first = -1, last = -1;
            
            // Find the first and last occurrence of the character
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == c) {
                    if (first == -1) {
                        first = i;
                    }
                    last = i;
                }
            }
            
            // Count unique characters between first and last occurrence
            if (first != -1 && last != -1 && last > first) {
                boolean[] seen = new boolean[26];
                for (int i = first + 1; i < last; i++) {
                    seen[s.charAt(i) - 'a'] = true;
                }
                for (boolean b : seen) {
                    if (b) count++;
                }
            }
        }
        
        return count;
    }
}
