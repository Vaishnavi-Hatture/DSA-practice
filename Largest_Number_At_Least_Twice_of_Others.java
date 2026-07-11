class Largest_Number_At_Least_Twice_of_Others {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int second = -1;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                second = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }

        return max >= 2 * second ? index : -1;
    }
}