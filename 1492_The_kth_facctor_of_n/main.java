class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> factors=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factors.add(i);
            }
        }
        if(k<=factors.size()&&k>0){
        return factors.get(k-1);
        }else{
            return -1;
        }
    }

    /******/
    int factor = 1;
        int output = -1;
        if (k == 1) return factor = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                factor++;
                if (factor == k) {
                    output = i;
                }
            }
        }
        if(output==-1&&k==(factor+1)){
            output=n;
        }
}
