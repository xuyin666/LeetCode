package DynamicProgrammation;

// Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
// Return the maximum product you can get.


public class IntegerBreak {
    public int integerBreak(int n) {
        int[] sumArr = new int[n + 1];
        sumArr[0] = 0;
        sumArr[1] = 1;
//        for (int i = 2 ; i <= n; i++) {
//            sumArr[i] = Integer.MIN_VALUE;
//            for (int j = 1; j <= i-1; j++) {
//                if (sumArr[i] < sumArr[j] * (i - j)){
//                    sumArr[i] = sumArr[j] * (i - j);
//                }
//            }
//        }
//        return sumArr[n];
        for (int i = 2 ; i <= n; i++) {
            sumArr[i] = Integer.MIN_VALUE;
            for (int j = 1; j <= i - 1; j++) {
                int doubleProduct = sumArr[j ] * sumArr[i - j];
                int simpleProduct = sumArr[j] * (i - j);
                int max = Math.max(doubleProduct, simpleProduct);
                if (sumArr[i] < max){
                    sumArr[i] = max;
                }
            }
        }
        return sumArr[n];
    }
}
