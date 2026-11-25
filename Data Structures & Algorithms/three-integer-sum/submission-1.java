class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int current = 1;
        while(current < nums.length - 1){
            int i = 0;
            int j = nums.length - 1;
            while(i < current && j > current){
                if(nums[current] + nums[i] + nums[j] == 0){
                    List<Integer> list2 = new ArrayList<>();
                    list2.add(nums[current]);
                    list2.add(nums[i]);
                    list2.add(nums[j]);
                    if(!list.contains(list2)){
                        list.add(list2);
                    }
                    i++;
                }
                else if(nums[current] + nums[i] + nums[j] < 0){
                    i++;
                }
                else{
                    j--;
                }
            }
            current++;
        }
        return list;
    }
}
