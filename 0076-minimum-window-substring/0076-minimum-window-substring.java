class Solution {
    public String minWindow(String S, String T) {
    if(T.length()>S.length()) return "";
    HashMap<Character,Integer>map=new HashMap<>();
    for(char ele:T.toCharArray()){
      map.put(ele,map.getOrDefault(ele,0)+1);
    }
    int required=T.length();
    int minLen=Integer.MAX_VALUE;
    int start=0,left=0;
    for(int right=0;right<S.length();right++){
      char c=S.charAt(right);
      if(map.containsKey(c)){
        if(map.get(c)>0) required--;
        map.put(c,map.get(c)-1);
      }
      while(required==0){
        if(right-left+1<minLen){
          minLen=right-left+1;
          start=left;
        }
        char d=S.charAt(left);
        if(map.containsKey(d)){
          map.put(d,map.get(d)+1);
          if(map.get(d)>0) required++;
        }
        left++;
      }
    }
    return minLen==Integer.MAX_VALUE ? "":S.substring(start,start+minLen);
  }
}
