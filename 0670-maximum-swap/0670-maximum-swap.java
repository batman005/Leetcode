class Solution {
    private void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }

    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        
        // 1. Prepare last index to digit
        int[] li = new int[10];
        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i] - '0';
            li[digit] = i;
        }

        // 2. Figure out position for swapping
        boolean flag = false;
        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i] - '0';
            for (int j = 9; j > digit; j--) {
                if (i < li[j]) {
                    swap(digits, i, li[j]);
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                break;
            }
        }

        // 3. Prepare answer in the form of an integer
        int res = 0;
        for (char digit : digits) {
            res = res * 10 + (digit - '0');
        }
        return res;
    }
}
