class Solution {
    public int[] twoSum(int[] nums, int target) {
        // boolean flag=false;
        // List<Integer>ans=new ArrayList<>();
        // Set<Integer>set=new HashSet<>();
        // for(int ele:nums){
        //     int rem=target-ele;
        //     if(set.contains(rem)){
        //         flag=true;
        //         list.add(ele);
        //         list.add(rem);
        //     }
        // }
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};                 
                }
            }
        }
        return new int[]{};
    }
}