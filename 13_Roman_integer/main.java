class Solution {
    public int romanToInt(String s) {
        int[] romanValues = new int[128]; 
        romanValues['I'] = 1;
        romanValues['V'] = 5;
        romanValues['X'] = 10;
        romanValues['L'] = 50;
        romanValues['C'] = 100;
        romanValues['D'] = 500;
        romanValues['M'] = 1000;
        int result = 0;

        for(int i=0;i<s.length();i++){
            if (i + 1 < s.length()&&romanValues[s.charAt(i)]<romanValues[s.charAt(i+1)]){
                result-=romanValues[s.charAt(i)];
            } else {
                result+=romanValues[s.charAt(i)];
            }
        }
        return result; 
    }
}
