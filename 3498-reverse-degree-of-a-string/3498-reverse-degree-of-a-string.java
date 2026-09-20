class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int result = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            // Reverse alphabet position: 'a' = 26, 'z' = 1
            int reversePos = 26 - (c - 'a');

            // String position is 1-indexed
            int strPos = i + 1;

            result += reversePos * strPos;
        }

        return result;
    }
}
