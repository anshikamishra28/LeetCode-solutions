class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones=0;
        for(char c:s.toCharArray()){
            if(c=='1'){
                ones++;
            }
        }
        int zeroes=s.length()-ones;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<ones-1;i++){
            str.append('1');
        }
        for(int i=0;i<zeroes;i++){
            str.append('0');
        }
        str.append('1');
        return str.toString();
    }
}