package Array;

public class BinarySearch {

    // First Solution, [left, right]
//    public int search(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//        while (left <= right) {
//            int middle = (left + right) / 2;
//            if (nums[middle] > target) {
//                right = middle - 1;
//            } else if (nums[middle] < target) {
//                left = middle + 1;
//            } else {
//                return middle;
//            }
//        }
//        return -1;
//    }

    // Second Solution, [left, right)
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int middle = (left + right) / 2;
            // it means nums[middle] is bigger than target
            // so right will be middle, (in the theory we will ignore the middle)
            if (nums[middle] > target) {
                right = middle;
            } else if (nums[middle] < target) {
                // it means nums[middle] is smaller than target
                // so right will be middle + 1,
                // (in the theory we know that middle is smaller than target)
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }




}
