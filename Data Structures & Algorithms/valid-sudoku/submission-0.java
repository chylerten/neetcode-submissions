class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(map1.get(board[i][j]) != null || map2.get(board[j][i]) != null){
                    return false;
                }
                if(board[i][j] != '.'){
                    map1.put(board[i][j], 1);
                }
                if(board[j][i] != '.'){
                    map2.put(board[j][i], 1);
                }
            }
            map2.clear();
            map1.clear();
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                map1.clear();
                for(int k = 0; k < 3; k++){
                    for(int l = 0; l < 3; l++){
                        if(map1.get(board[j * 3 + l][i * 3 + k]) != null){
                            return false;
                        }
                        if(board[j * 3 + l][i * 3 + k] != '.'){
                            map1.put(board[j * 3 + l][i * 3 + k], 1);
                        }
                    }
                }
            }
        }
        return true;
    }
    
}
