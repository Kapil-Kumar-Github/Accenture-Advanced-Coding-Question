public class wordSearch {
    static boolean search(char [][] board,String word){
        int row = board.length;
        int col = board[0].length ;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(dfs(board,i,j,word,0)){
                    return true ;
                }
            }
        }
        return false ;
    }
    static boolean dfs(char [][] board,int row,int col,String word, int wordIndex){
        if(wordIndex==word.length()){
            return true ;
        }
        if(row<0 || row>=board.length || col<0 || col>=board[0].length || board[row][col]!=word.charAt(wordIndex)){
            return false ;
        }
        char temp = board[row][col] ;
        board[row][col] = '*' ;
        boolean find = dfs(board,row+1,col,word,wordIndex+1)||dfs(board,row,col+1,word,wordIndex+1)
                || dfs(board,row-1,col,word,wordIndex+1) || dfs(board,row,col-1,word,wordIndex+1) ;
        board[row][col] = temp ;

        return find ;

    }
    public static void main(String [] args){
        char [][] board = {{'A','B','C','E'},{'S','E','C','S'},{'A','D','E','E'}} ;
        System.out.println("Grid be: ");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        String word = "ABCCED" ;
        System.out.println(search(board,word)) ;
    }


}
