public class spiralMatrix {
    static void spiralMatrix(int [][] m){
        int left = 0;
        int right = m[0].length -1 ;

        int top = 0 ;
        int bottom = m.length -1 ;

        while(left <=right && top<=bottom) {

            for (int i = left; i <= right; i++) {
                System.out.print(m[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(m[i][right] + " ");
            }
            right--;

                      if (top <= bottom) {
                for (int i = right; i>=left; i--) {
                    System.out.print(m[bottom][i] + " ");
                }


            }
            bottom--;



        }

    }
    public static void main(String [] args){
        int [][] a = {{1,2,3}  ,{4,5,6},{7,8,9}} ;

        System.out.println("Matrix be ") ;
        for(int i=0;i<a.length ;i++){
            for(int j=0;j<a[0].length ;j++){
                System.out.print(a[i][j] + " ") ;
            }
            System.out.println();
        }
        System.out.println("Spiral Order Of Matrix be ") ;
        spiralMatrix(a)  ;
    }

}

