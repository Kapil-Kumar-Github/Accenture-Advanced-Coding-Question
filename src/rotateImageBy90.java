public class rotateImageBy90 {

        static void printMatrix(int [][] m){

            for(int i=0;i<m.length;i++){
                for(int j=0;j<m[0].length;j++){
                    System.out.print(m[i][j] + " ") ;
                }
                System.out.println() ;
            }
        }


        static int[][] rotatingImageBy90(int [][] m){
            int row = m.length ;
            int col = m[0].length ;

            int [][]  r = new int [row][col] ;

            for(int i=0; i<row ; i++){
                for(int j=0 ; j<col ; j++){

                    r[i][j] = m[row-1-j][i] ;
                }
               //System.out.println();
            }
            return r ;
        }
        public static void main(String [] args){

        int [][] a = {{1,2,3},{4,5,6},{7,8,9}} ;
        System.out.println("Matrix be ") ;
        printMatrix(a) ;


        int [][] rr = rotatingImageBy90(a) ;
        System.out.println("Matrix after 90 degree rotation ") ;
        printMatrix(rr) ;



    }
}
