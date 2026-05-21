class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length]; 
        for(int i =0 ; i<nums.length ; i++){
            int temp = (int)Math.abs(nums[i]);
            arr[i] = temp * temp;
        }
        Arrays.sort(arr);
        return arr;
    }
}