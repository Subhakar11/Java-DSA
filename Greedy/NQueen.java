public class NQueen {
    public static boolean isSafe(char board[][] ,int row, int col){
        // vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col] =='Q'){
            return false;
        }
        }
        //digonal left up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
           if( board[i][j]=='Q'){
            return false;
        }
        }
        // diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
           if(board[i][j] == 'Q'){
            return false;
        }
        }
        return true;

    }
    public static void nqueen(char board[][] , int row){
        if(row ==board.length){
            count++;
            printboard(board);
            return;
        }
     
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){ 
            board[row][j] = 'Q';
            nqueen(board, row+1);
            board[row][j] = 'X';
            }
        }
    }
    public static void printboard(char board[][]){
        System.out.println("---------------NQueen----------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
       
    }
    static int count = 0;
    public static void main(String[] args) {
        int   N = 4;
       
        char board[][] = new char[N][N];
        for(int i=0;i<N; i++){
            for(int j=0;j<N;j++){
                board[i][j]='X';
            }
        }
        nqueen(board,0);
        System.out.println("Total way to passible NQueen problem:"+ count);
    }
}
