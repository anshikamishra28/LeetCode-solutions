class Solution {
    public int missingInteger(int[] nums) {
        int i = 0;
        while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
            i++;
        }

     
        int prefixSum = 0;
        for (int j = 0; j <= i; j++) {
            prefixSum += nums[j];
        }

       
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int x = prefixSum;
        while (set.contains(x)) {
            x++;
        }
        return x;
    }
}
