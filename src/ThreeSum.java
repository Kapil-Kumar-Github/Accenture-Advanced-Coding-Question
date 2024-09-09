public class ThreeSum {
    static void  def(int [] arr){
        int len = arr.length ;
        int num1 , num2 , num3 =0;
        for(int i=0;i<len;i++){

            num1 = arr[i] ;
            for(int j=i+1;j<len-2;j++){
                num2 = arr[j] ;
                for(int z=j+1 ;z<len-1;z++){
                    num3 =arr[z] ;
                    //System.out.println(num1+","+num2+","+num3) ;
                    if(num1 + num2 + num3 ==0 && num1 !=0){
                        System.out.print("["+num1+","+num2+","+num3+"]") ;
                    }
                }
            }
        }
      //  new int[] ;
    }
    public static void main(String [] args){
        int a[] = {-1,0,1,2,-1,-4} ;
        def(a) ;

    }
}
