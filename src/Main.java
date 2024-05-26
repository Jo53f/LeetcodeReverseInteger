public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().reverse(456));
    }

    public int reverse(int x) {
        int firstDigit = x % 10; // Will be used to check that x is still signed the same, ie positive if it started that way.
        int tensCount = 1; // Count multiplied by 10 for each digit, then divided by 10.
        int res = 0;

        while (x != 0) {
            res = res * 10 + x % 10;
            /**
             * tensCount is multiplied by 10, by as many times as there are digits in
             * (x - (one digit)).
             */
            if ((x /10) != 0) {
                tensCount *= 10;
            }
            x = x / 10;
        }

        /**
         * The number should always be negative if it started negative, and positive
         * if it started positive. Check for these two cases and return 0 if true.
         * Then the remainder of the first digit of X, should equal to the digit of res divided
         * by 10^(number of digits - 1). Otherwise, return 0
         */
        if ((res > 0 && 0 > firstDigit) || (res < 0 && 0 < firstDigit) || (tensCount != 0 && res/tensCount != firstDigit)) {
            return 0;
        }

        return res;
    }
}