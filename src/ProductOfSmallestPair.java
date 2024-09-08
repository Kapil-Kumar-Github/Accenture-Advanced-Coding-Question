import java.util.Arrays;
public class ProductOfSmallestPair {
    static int def(int [] arr, int sum){
        if(arr.length <2 || arr.length ==0){
            return -1 ;

        }
        int len = arr.length ;
        int pairSum=0;
        int lowestPairSum = Integer.MAX_VALUE;
        int lowestMultiple =0;

        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                pairSum= arr[i] + arr[j] ;
                lowestPairSum=Math.min(lowestPairSum,pairSum) ;
                if(pairSum==lowestPairSum){

                    lowestMultiple= arr[i]*arr[j] ;


                }
            }
        }
        if(lowestMultiple ==0){
            return 0 ;
        }
        return lowestMultiple ;
    }
    static int def1(int [] arr , int sum){
        Arrays.sort(arr) ;
        int n = arr.length ;
        if(n==0 || n <2){
            return -1;
        }
        if(arr[0]+arr[1]<=sum){
            return (arr[0]*arr[1]) ;
        }
        return 0 ;
    }
    public static void main(String [] args){
        int [] a ={5,2,4,3,9,7,1} ;
        System.out.println(def(a , 9)) ;
        System.out.println(def1(a,9) );

    }
}
