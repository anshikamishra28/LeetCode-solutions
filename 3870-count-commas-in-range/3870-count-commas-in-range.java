class Solution {
    public int countCommas(int n){
      long total=0;
      if(n>=1000){
        total+=(long)(Math.min(n,999999)-999)*1;
      }
      if(n>=1000000){
        total+=(long)(Math.min(n,999999999)-999999)*2;
      }
      if(n>=1000000000){
        total+=(long)(Math.min(n,999999999999L)-999999999)*3;
      }
      if(n>=1000000000000L){
        total+=(long)(Math.min(n,999999999999999L)-999999999999L)*4;
      }
      return (int)total;
    }
}