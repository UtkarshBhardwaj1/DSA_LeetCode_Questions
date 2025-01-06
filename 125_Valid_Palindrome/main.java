class Solution {
    public boolean isPalindrome(String input) {
        if (input == null)return false;
		int low=0;
		int high=input.length()-1;
		while(low<high) {
		while(low<high && !Character.isLetterOrDigit(input.charAt(low))) {
			low++;
		}
		while(low<high && !Character.isLetterOrDigit(input.charAt(high))) {
			high--;
		}
		if(Character.toLowerCase(input.charAt(low))!=Character.toLowerCase(input.charAt(high))) {
			return false;
		}low++;high--;
		}
		return true;
    }
}


//Using reverse
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuffer ob = new StringBuffer(s);
        String ss = ob.reverse().toString();
        if (ss.equals(s)){
            return true;
        }
        return false;
    }
}
