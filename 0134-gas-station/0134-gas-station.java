class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0,fuel=0,gain=0,total=0;     
        for(int i=0;i<gas.length;i++){       
            gain=gas[i]-cost[i];
            fuel+=gain;
            total+=gain;
            if(fuel<0){
                start=i+1;
                fuel=0;
            }
        }
        if(total<0) return -1;
        return start;
    }
}