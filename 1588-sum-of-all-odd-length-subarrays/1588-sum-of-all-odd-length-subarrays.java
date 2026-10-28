class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int total=(i+1)*(n-i);
            int oddCount=(total+1)/2;
            ans+=arr[i]*oddCount;
        }
        return ans;

    }
}