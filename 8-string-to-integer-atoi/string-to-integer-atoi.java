class Solution {
    public int myAtoi(String s) {

        // 1. Remove leading spaces
        s = s.trim();
        if (s.isEmpty()) return 0;

        int i = 0;
        int sign = 1;
        long num = 0; // use long to detect overflow safely

        // 2. Check sign
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');

            // 4. Handle overflow
            if (num * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (num * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        // 5. Return result
        return (int) (num * sign);
    }
}
