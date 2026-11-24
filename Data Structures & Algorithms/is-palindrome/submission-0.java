class Solution {
    public boolean isPalindrome(String s) {
        int front = 0;
        s = s.toLowerCase();
        int rear = s.length() - 1;
        while(front < rear){
            if(!isInRange(s.charAt(front))){
                front++;
            }
            if(!isInRange(s.charAt(rear))){
                rear--;
            }
            if(isInRange(s.charAt(front)) && isInRange(s.charAt(rear))){
                if(s.charAt(front) != s.charAt(rear)){
                    return false;
                }
                front++;
                rear--;
            }
        }
        return true;
    }
    private boolean isInRange(char c){
        if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')){
            return true;
        }
        return false;
    }
}
