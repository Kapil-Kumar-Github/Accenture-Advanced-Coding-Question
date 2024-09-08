public class Exponent_Of_Two {
    static boolean exponentOfTwo(int n){
        int res = n & (n-1) ;
        if(res==0){
            return true ;
        }
        return false;
    }

    static int def(int a, int b){
        int ret = Integer.MAX_VALUE ;
        for(int i=a ;i<=b;i++){

            if(exponentOfTwo(i)==true){
                ret = Math.min(ret,i) ;

            }
        }
        return ret ;
    }
    public static void main(String [] args){
        System.out.println(def(7,12)) ;
    }
}
