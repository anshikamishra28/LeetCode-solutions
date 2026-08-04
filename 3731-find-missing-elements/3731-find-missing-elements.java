class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        List<Integer>ans=new LinkedList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
        set.add(num);      
        if(num<min) min=num;
        if(num>max) max=num;
        }
        for(int i=min+1;i<max;i++){
            if(!(set.contains(i))){
                ans.add(i);
            }
        }
        return ans;
    }
}