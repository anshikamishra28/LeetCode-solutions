class Solution {
    public int smallestNumber(int n, int t) {
      
        int temp=n;
        for(int i=n;;i++){
            int pro=1;
            temp=i;
            while(temp>0){
            int num=temp%10;
            pro=pro*num; 
              temp=temp/10;     
            }    
            
            if(pro%t==0) return i;
        }
    
    }
}