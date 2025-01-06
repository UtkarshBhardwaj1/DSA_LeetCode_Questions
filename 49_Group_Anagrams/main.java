class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String j : strs){
            char [] arrayString=j.toCharArray();
            Arrays.sort(arrayString);
            String sorted=new String(arrayString);
            if(!map.containsKey(sorted)){
                map.put(sorted,new LinkedList<>());
            }
            map.get(sorted).add(j);
        }
        return new LinkedList<>(map.values());
    }
}
