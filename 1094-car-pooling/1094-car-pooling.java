class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int [] diff=new int[1001];
        for(int[]trip:trips){
            int p=trip[0];
            int from=trip[1];
            int to=trip[2];

            diff[from]+=p;
            diff[to]-=p;
        }
        int curr=0;
        for(int i=0;i<1001;i++){
            curr+=diff[i];
            if(curr>capacity){
                return false;
            }
        }
        return true;
    }
}