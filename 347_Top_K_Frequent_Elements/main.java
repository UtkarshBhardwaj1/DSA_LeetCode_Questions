
class Solution {
    public int[] topKFrequent(int[] x, int y) {
       int [] result=new int[y];
        Map<Integer,Integer> map=new HashMap<>();
        for(int item:x){
            map.put(item,map.getOrDefault(item,0)+1);
        }
         List<Integer> []element=new List[x.length+1];
        for(int i=0;i<element.length;i++){
            element[i]=new ArrayList<>();
        }
        for(int item:map.keySet()){
            element[map.get(item)].add(item);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=element.length-1;i>=0;i--){
            List<Integer> ls=element[i];
            for(int j:ls){
                ans.add(j);
            }
        }

        while(y-- >0){
            result[y]=ans.get(y);
        }
        return result;
    }
    
}


//Using Stream

class Solution {
    public int[] topKFrequent(int[] x, int y) {
       int [] result=new int[y];
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> sortedMap=new LinkedHashMap<>();
        for(int item:x){
            map.put(item,map.getOrDefault(item,0)+1);
        }
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(item->sortedMap.put(item.getKey(), item.getValue()));
        for(int i:sortedMap.keySet()){
            result[result.length-(y--)]=i;
            if(y==0)break;
        }
        return result;
    }
    
}
