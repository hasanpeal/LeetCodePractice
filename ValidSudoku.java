import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet <String> set = new HashSet<>();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                char curr = board[i][j];
                if(curr != '.'){
                    if(!set.add(curr + " in row " + i) || !set.add(curr + " in col " + j) || !set.add(curr + " in between " + i/3 + " and " + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
