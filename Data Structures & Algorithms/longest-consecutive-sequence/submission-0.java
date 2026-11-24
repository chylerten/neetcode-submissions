class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int max = 1;
        int row = 1;
        int current = 0;
        while(current < nums.length - 1){
            if(nums[current] == nums[current + 1] - 1){
                row++;
                if(row > max){
                    max = row;
                }
            }
            else if(nums[current] != nums[current + 1]){
                row = 1;
            }
            current++;
        } 
        return max;
    }
}
