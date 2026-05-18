class Pivot_index {
    public int pivotIndex(int[] nums) {

        int Sum = 0;

       
        for (int i = 0; i < nums.length; i++) {
            Sum += nums[i];
        }

        int lSum = 0;

        // Check pivot index
        for (int i = 0; i < nums.length; i++) {

            int rSum = Sum - lSum - nums[i];

            if (lSum == rSum) {
                return i;
            }

            lSum += nums[i];
        }

        return -1;
    }
}