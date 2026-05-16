class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int op=0;
        for(int i=0 ; i<nums.length; i++){

            if (nums[i]==target){
                op=i;
            }
            else{
                
                if(target < nums[0]){
                    op= 0;
                }
                else if(target > nums[nums.length-1]){
                op = nums.length;
                }
                else if(nums[i]< target && target<nums[i+1]){
                    op = i+1;
                }

            }
            
        }
         return op;
    }
}