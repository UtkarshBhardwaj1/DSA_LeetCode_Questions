class Solution {
    public int reverse(int x) {
         long a = 0;
        while (x != 0) {
            int b = x % 10;
            a = (a * 10) + b;
            x = x / 10;
        }
        if (a < Integer.MIN_VALUE || a > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) a; 
    }
}
