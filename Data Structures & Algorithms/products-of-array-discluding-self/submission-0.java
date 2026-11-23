class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] newNums = new int[nums.length];
        int product = nums[0];
        newNums[0] = 1;
        for(int i = 1; i < nums.length; i++){
            newNums[i] = product;
            product *= nums[i];
        }
        product = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--){
            newNums[i] *= product;
            product *= nums[i];
        }
        return newNums;
    }
}  
