class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();
        List<HashMap<Character, Integer>> maps = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            String current = strs[i];
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j = 0; j < current.length(); j++){
                map.put(current.charAt(j), map.getOrDefault(current.charAt(j), -1) + 1);
            }
            int num = 0;
            while(num < lists.size() && !map.equals(maps.get(num))){
                num++;
            }
            if(num < lists.size()){
                lists.get(num).add(current);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(current);
                lists.add(list);
                maps.add(map);
            }
        }
        return lists;
    }
}
