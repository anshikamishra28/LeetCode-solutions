class Solution {
    public String toHex(int num) {
        if(num==0)return "0";
        char[] hexChars="0123456789abcdef".toCharArray();
        StringBuilder sb=new StringBuilder();
        while(num!=0 && sb.length()<8){
            int digit=num & 0xF;
            sb.append(hexChars[digit]);
            num>>>=4;
        }
    
    return sb.reverse().toString();
    }
}