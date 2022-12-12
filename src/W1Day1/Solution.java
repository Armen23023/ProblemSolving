package W1Day1;

public class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for(int k = 0 ; k <= nums.length-1;k++) {
            for (int i = 0; i < k; i++) {
                leftSum = leftSum + nums[i];
            }
            for(int j = nums.length-1; j > k; j-- ){
                rightSum = rightSum + nums[j];
            }
            if (leftSum == rightSum ) {
                return k;
            }


            leftSum = 0;
            rightSum = 0;
        }
        return -1;
    }
}
