class Solution {
    public static int myAtoi(String s) {
        s = s.trim();
        
        if (s.isEmpty()) {
            return 0;
        }
        
        int index = 0;
        int sign = 1;
        long result = 0;
        

        if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }

    
        while (index < s.length()) {
            char c = s.charAt(index);
            if (Character.isDigit(c)) {
                result = result * 10 + (c - '0');
                
               
                if (result * sign > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (result * sign < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            } else {
                break;
            }
            index++;
        }
        
        return (int) result * sign;
    }

}
