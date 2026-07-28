class Solution {
    public void moveZeroes(int[] nums) {
        // if(nums.length == 0){
        //     break;
        // }

        int move_zeroes = 0; 
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[move_zeroes] = nums[i];
                move_zeroes++;
            }
        }

        for (int i = move_zeroes; i < nums.length; i++){
                nums[i] = 0;
        }
    }
}