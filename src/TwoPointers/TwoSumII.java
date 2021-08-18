package TwoPointers;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] sumArr = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                // 当两数的和恰好为我们目标值
                sumArr[0] = i + 1;
                sumArr[1] = j + 1;
                return sumArr;
            } else if (numbers[i] + numbers[j] > target) {
                // 当两数的和比我们的目标值大
                j--;
            } else {
                // 当两数的和比我们的目标值小
                i++;
            }
        }
        return null ;
    }
}
