import java.util.Scanner ;
public class Unique_Path {

    static int uniquePath(int [][] arr){
        int row = arr.length ;
        int col = arr[0].length ;

        int [][] uniqPath = new int [row][col] ;

        // Filling first row of uniqPath matrix
        for(int i=0;i<col;i++){
            uniqPath[0][i]= 1;

        }
        // Filling first column of Matrix
        for(int j=0;j<row;j++){
            uniqPath[j][0] = 1 ;
        }
        // Filling remaining elements of uniqPath matrix
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                uniqPath[i][j] = uniqPath[i-1][j] + uniqPath[i][j-1] ;
            }
        }

        return uniqPath[row-1][col-1] ;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter row of your matrix: ");
        int row = sc.nextInt() ;
        System.out.print("Enter column of your matrix: ") ;
        int col = sc.nextInt() ;
        int [][] m = new int[row][col] ;
       // System.out.println(m[0][2]) ;
        int mm = uniquePath(m) ;

//        for(int i=0;i<mm.length;i++){
//            for(int j=0;j<mm[0].length;j++){
//                System.out.print(mm[i][j] + " ") ;
//            }
//            System.out.println() ;
//        }
        System.out.println("Unique path reaching from top left corner of matrix to bottom right of matrix be: "+ mm) ;


    }
}
