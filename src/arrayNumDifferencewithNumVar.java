public class arrayNumDifferencewithNumVar {
    static int def(int [] arr , int length , int diff, int num){
        int count = 0;

        for(int i=0;i<length ;i++){
            int actual_Diff =arr[i]-num ;
            if(actual_Diff<0){
                actual_Diff=-actual_Diff ;
            }
            if(actual_Diff <= diff){
                count++ ;

            }
            //System.out.println("actual_diff be " + actual_Diff) ;

        }
        if(count==0){
            return -1 ;
        }
        return count ;
    }
    public static void main(String [] args){
        int [] a = {12,3,14,56,77,13} ;
        System.out.println(def(a,a.length , 2 , 13)) ;
    }
}
