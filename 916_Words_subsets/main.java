import java.util.*;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result=new ArrayList<>();
        int[] maxFreq=new int[26]; 
        for(String word:words2){
            int[] wordFreq=getFrequency(word);
            for(int i =0;i<26;i++){
                maxFreq[i]=Math.max(maxFreq[i], wordFreq[i]);
            }
        }
        for(String word:words1){
            int[]wordFreq =getFrequency(word);
            if(isUniversal(wordFreq,maxFreq)) {
                result.add(word);
            }
        }
        return result;
    }

    static int[]getFrequency(String word){
        int[] freq=new int[26];
        for(char c:word.toCharArray()) {
            freq[c-'a']++;
        }
        return freq;
    }

    static boolean isUniversal(int[] wordFreq,int[]maxFreq){
        for(int i=0;i<26;i++){
            if(wordFreq[i]<maxFreq[i]){
                return false;
            }
        }
        return true;
    }
}
