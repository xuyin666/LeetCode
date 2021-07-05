package Array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int fastIndex = 0;
        int slowIndex ;
        int len = nums.length;
        // fastIndex increment
        for (slowIndex = 0; fastIndex <= len - 1; fastIndex++) {
            // if nums[fastIndex] == val we continue
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}
