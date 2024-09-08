public class TotalCarry {

    static int def(int num1 , int num2){
        int remain1 =0;
        int remain2 =0;
        int carry =0;


        while(num1>0 && num2>0){
            remain1 = num1%10 ;
            remain2 = num2%10 ;
            num1 = num1 /10 ;
            num2 = num2 /10 ;

            if((remain1+remain2)>9){
                carry++;
                num1+=(remain1+remain2)%9 ;
            }

        }
        return carry ;
    }

    public static void main(String [] args){
        System.out.println(def(451,349 ) );

    }
}
