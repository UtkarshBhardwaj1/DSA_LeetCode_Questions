class Solution {
    public boolean isAnagram(String s, String t) {
         s=s.toLowerCase();
        t=t.toLowerCase();

        if (s.length() !=t.length()) {
            return false;
        }

        int[] count= new int[26];

        for (int i=0;i<s.length();i++) {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for (int i=0;i<26;i++) {
            if (count[i] !=0) {
                return false;
            }
        }
        return true;
    }
}

//Using Sort
class Solution {
    public boolean isAnagram(String s, String t) {
        char [] forS=s.toCharArray();
        char [] forT=t.toCharArray();
        Arrays.sort(forS);
        Arrays.sort(forT);
        String tt=new String(forT);
        String ss=new String(forS);
        if(tt.equals(ss)){
            return true;
        }
        return false;
    }
}
