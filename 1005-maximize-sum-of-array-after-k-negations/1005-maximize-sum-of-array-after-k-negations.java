class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        int minAbs=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0 && k>0){
                nums[i]=nums[i]*(-1);
                k--;
            }
            sum+=nums[i];
            minAbs=Math.min(minAbs,Math.abs(nums[i]));
           
        }  
         if(k%2!=0){
                sum=sum-2*minAbs;
                }
            
            return sum;
    }
           
    }
