import java.util.*;
public class DistinctAndDuplicateElements {

    static int AddDistinctDuplicate(int a, int b , int c , int d){
        int [] arr = {a,b,c,d} ;
        int distinctSum = 0 ;
        int duplicateSum = 0;

        HashMap<Integer,Integer> hashMap= new HashMap<Integer,Integer>() ;
        for(int i=0 ; i<arr.length;i++){
            int times = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    times++ ;
                }

            }
            hashMap.put(arr[i],times) ;

        }
        for(int m:hashMap.keySet()){


               if( hashMap.get(m)== 1 ){
                  distinctSum += m ;
                 //  System.out.println(m);

            }
            else{
                duplicateSum += m;
            }
        }
       // System.out.println("distinct sum be " + distinctSum + " duplicate sum be " + duplicateSum);


        return (distinctSum - duplicateSum);




    }
    public static void main(String [] args){
        System.out.println(AddDistinctDuplicate(5,4,4,9)) ;

    }
}
