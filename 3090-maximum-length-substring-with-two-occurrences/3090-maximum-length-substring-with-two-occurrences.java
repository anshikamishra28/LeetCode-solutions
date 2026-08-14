class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
       int maxLen = 0;

       
        for (int i = 0; i < n; i++) {
            int[] freq = new int[256]; 
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                freq[c]++;

                
                if (freq[c] > 2) break;

                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
}