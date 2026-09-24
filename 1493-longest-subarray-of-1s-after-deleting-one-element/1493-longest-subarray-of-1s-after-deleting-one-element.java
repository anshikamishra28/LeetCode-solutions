class Solution {
    public int longestSubarray(int[] arr) {
    int ans=0,start=0,end=0;
    int zero=0;
    for(end=0;end<arr.length;end++){
      if(arr[end]==0) zero++;   
      while(zero>1){
        if(arr[start]==0) zero--;
        start++; 
    } 
    ans=Math.max(ans,end-start);
    }   
    return ans;
        
    }
}