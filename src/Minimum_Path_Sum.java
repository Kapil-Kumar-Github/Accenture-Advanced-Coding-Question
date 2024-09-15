public class Minimum_Path_Sum {
    static int minimumPath(int [][] arr){
        int row = arr.length ;
        int col = arr[0].length ;

        int[][] min = new int[row][col] ;
        min[0][0]=arr[0][0] ;
        // Filling first row
        for(int i=1;i<col;i++){
            min[0][i] = min[0][i-1] + arr[0][i] ;
           // System.out.println("hii") ;

        }
        // Filling first column
        for(int j=1;j<col;j++){
            min[j][0] = min[j-1][0]  + arr[j][0];
        }
        // Filling remaining array
        for(int i=1 ; i<row ;i++){
            for(int j=1;j<col;j++){
                min[i][j] = Math.min(min[i-1][j], min[i][j-1]) + arr[i][j] ;
            }

        }
        return min[row-1][col-1] ;
    }
    public static void main(String [] args){
        int [][] arr = {{1,3,1},{1,5,1},{4,2,1}} ;
        System.out.println("Array be : ") ;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println() ;
        }

        System.out.print("Minimum path from first row and  first column to last row and last column be:   ") ;
        System.out.println(minimumPath(arr) );
//       System.out.println("Minimum Matrix be : ") ;
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a[0].length;j++){
//                System.out.print(a[i][j] + " ") ;
//            }
//            System.out.println() ;
//        }


    }
}
