class Solution {
    public long sumAndMultiply(int n) {
        String s=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){        
            if(c!='0'){
            sb.append(c);
            }
        }
        int x;
        x=sb.length()==0?0:Integer.parseInt(sb.toString());

        int sum=0;
        int temp=x;
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        return (long)x*sum;
    }
}