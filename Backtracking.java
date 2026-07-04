class Backtracking {
    public void printBoard(char[][] board, List<List<String>> allBoard){
        String row="";
        List<String> newboard = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row = "";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q')
                row+='Q';
                else
                row+='.';
            }
            newboard.add(row);
        }
        allBoard.add(newboard);
    }
    public boolean isSafe(char[][] board, int row, int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col] =='Q')
            return false;
        }
        for(int i=row-1,j=col-1; i>=0 &&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q')
            return false;
        }
        return true;
    }
    public void nQueen(char[][] board, List<List<String>> allBoard, int row ){
        if(row== board.length){
            printBoard(board, allBoard);
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board, row, col)){
                board[row][col]='Q';
                nQueen(board, allBoard, row+1);
                board[row][col]= '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board= new char[n][n];
        nQueen(board,allBoard,0);
        return allBoard;
    }
}
