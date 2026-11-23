class Solution {

    public String encode(List<String> strs) {
        String output = "";
        for(String str : strs){
            output += str;
            output += (char) 257;
        }
        return output;
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        if (str.isEmpty()) {
            return output;
        }
        String[] strings = str.split(String.valueOf((char) 257), -1);
        output = new ArrayList<>(Arrays.asList(strings));
        output.remove(output.size() - 1);
        return output;
    }
}
