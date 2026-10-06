class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>deque=new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            while(!deque.isEmpty() && deque.peekFirst()<i-k+1){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i]){
                deque.removeLast();
            }
            deque.addLast(i);
            if(i>=k-1){
                result.add(nums[deque.peekFirst()]);
            }
        }
        int ans[]=new int[result.size()];
        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
}