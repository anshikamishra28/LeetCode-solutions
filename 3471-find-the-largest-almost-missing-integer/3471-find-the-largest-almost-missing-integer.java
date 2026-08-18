class Solution {
    public int largestInteger(int[] nums, int k) {
        int largest=-1;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int start=0;start<=nums.length-k;start++){
            for(int j=start;j<start+k;j++){
                if(nums[i]==nums[j]) {
                    count++;
                    break;
                }
            }
        }
        if(count==1) largest= Math.max(largest,nums[i]);
        }
       return largest;
    }
}