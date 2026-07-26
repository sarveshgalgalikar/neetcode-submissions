class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        if(nums.length <= 1){
            return arr; 
        }
        
        
        for(int i = 0 ; i < nums.length; i++){
            int j = i + 1;
            while(j < nums.length && i != j){
                if(target - nums[i] == nums[j]){
                    arr[0] = i; 
                    arr[1] = j;
                    return arr; 
                } else {
                    j++;
                    continue;
                }

            }

        }
        return arr;

    }
}
