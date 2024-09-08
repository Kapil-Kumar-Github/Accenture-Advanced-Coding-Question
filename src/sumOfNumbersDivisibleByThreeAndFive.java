public class sumOfNumbersDivisibleByThreeAndFive {

    static int calculate(int m , int n){
        int sum =0;

        for(int i=m;i<=n;i++){
            if(i%3==0 && i%5==0){
                sum+=i ;
            }
        }
        return sum ;
    }
    public static void main(String [] args){
        System.out.println(calculate(12,50)) ;
    }
}
