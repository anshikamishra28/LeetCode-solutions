class Solution {
   
    
    public boolean checkDivisibility(int n) {
        int num=n;
        int sum=0;
        int pro=1;
        while(num>0){
            int d=num%10;
            sum+=d;
            pro=pro*d;
            num=num/10;
        }
        int total=sum+pro;
        return (n%total==0);
        
    }
}