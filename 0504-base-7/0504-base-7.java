class Solution {
    public String convertToBase7(int num) {
        // Handle zero directly
        if (num == 0) return "0";

        // Track sign
        boolean isNegative = num < 0;
        num = Math.abs(num);

        StringBuilder sb = new StringBuilder();

        // Repeatedly divide by 7
        while (num > 0) {
            sb.append(num % 7);  // remainder
            num /= 7;            // reduce number
        }

        // Reverse to get correct order
        if (isNegative) sb.append('-');
        return sb.reverse().toString();
    }
}
