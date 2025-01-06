class Solution
{
    public boolean threeConsecutiveOdds(int[] arr)
    {
        
        int a=0;
        

        for (int b : arr) 
        {
            if(b%2==1)
            {
                a+=1;
                if(a==3)
                {
                    return true;
                }
            }else
            {
                a=0;
            }
        }return false;
    }  
    
}
