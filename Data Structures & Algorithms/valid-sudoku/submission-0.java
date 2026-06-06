class Solution {
    public boolean isValidSudoku(char[][] board) {

        Map<Character, Integer> row = new HashMap<>();
        Map<Character, Integer> col = new HashMap<>();
        Map<Character, Integer>[] boxes = new HashMap[9];

        for(int i = 0; i < 9; i++){
            boxes[i] = new HashMap<>();
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){

                if(board[i][j] == '.') continue;

                int boxIndex = (i / 3) * 3 + (j / 3);

                if(row.containsKey(board[i][j])) return false;
                row.put(board[i][j], 1);

                if(boxes[boxIndex].containsKey(board[i][j])) return false;
                boxes[boxIndex].put(board[i][j], 1);
            }
            row.clear();
        }

        for(int i = 0; i < board[0].length; i++){
            for(int j = 0; j < board.length; j++){

                if(board[j][i] == '.') continue;

                if(col.containsKey(board[j][i])) return false;
                col.put(board[j][i], 1);
            }
            col.clear();
        }

        return true;
    }
}
