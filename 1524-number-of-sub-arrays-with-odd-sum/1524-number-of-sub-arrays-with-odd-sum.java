class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD=1000000007;
        long even=1,odd=0,prefixSum=0,ans=0;
        for(int num:arr){
            prefixSum+=num;
            if(prefixSum%2==0){
                ans=(ans+odd)%MOD;
                even++;
            }else{
                ans=(ans+even)%MOD;
                odd++;
            }
        }
        return (int)ans;
    }
}