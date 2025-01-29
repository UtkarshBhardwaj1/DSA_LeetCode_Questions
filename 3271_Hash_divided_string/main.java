class Solution {
    public String stringHash(String s, int k) {
        StringBuilder ans=new StringBuilder();
        int n=s.length();
        
        for(int i=0;i<n;i+=k){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=s.charAt(j)-'a';
            }
            int hashedChar=sum%26;
            ans.append((char)('a'+hashedChar));
        }
        return ans.toString();
    }
}
