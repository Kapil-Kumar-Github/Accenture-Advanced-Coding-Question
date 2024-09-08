public class Rat_House_Problem {
    static int def(int r , int unit , int [] arr){
        int foodRequired = r*unit ;
        int foodAvailable =0 ;
        int i=0 ;
        if(arr==null){
            return -1 ;
        }
        while(foodRequired>foodAvailable){
            foodAvailable +=arr[i] ;
            i++ ;
            if(i==arr.length){
                break ;
            }

        }
        if(foodRequired>foodAvailable){
            return 0 ;
        }
        return i ;
    }
    public static void main(String[] args) {
        int [] food = {2,8,3,5,7,4,1,2} ;
        System.out.println(def(7,2,food) ) ;
    }
}
