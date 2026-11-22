class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.get(i) != null){
                map.put(i, map.get(i) + 1);
            }
            else{
                map.put(i, 1);
            }
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int i : map.keySet()){
            if(buckets[map.get(i)] == null){
                buckets[map.get(i)] = new ArrayList<Integer>();
            }
            buckets[map.get(i)].add(i);
        }
        int count = 0;
        int[] topK = new int[k];
        for(int i = nums.length; i > 0; i--){
            if(buckets[i] != null){
            for(int j : buckets[i]){
                topK[count] = j;
                count++;
                if(count == k){
                    return topK;
                }
            }
            }
        }
        return topK;
    }
}
