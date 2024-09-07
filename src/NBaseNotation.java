public class NBaseNotation {
    static String generateValue(int m){
        char [] c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray() ;
        for(int i=0;i<c.length;i++){
            if(m==i) {
                return String.valueOf(c[i]) ;

            }
        }
        return "" ;
    }

    static String def(int n , int num){
        int quot=0;
        int remain = 0;
        String str = "" ;
        String add = "";

        quot = num /n ;
        remain = num % n ;
        add = generateValue(remain) ;
        str = str + add;



        while(quot!=0){
//            System.out.println("quotient be "+quot);
//            System.out.println("remainder be "+remain);

            num = num /n ;
            quot = num / n ;
            remain = num % n ;
            add=generateValue(remain) ;
            str=str+add ;



        }
        //System.out.println("str be "+ str) ;
        StringBuilder b= new StringBuilder(str) ;
        b.reverse();
        String re = b.toString() ;

        return re ;

    }
    public static void main(String [] args){
        System.out.println(def(12,718)) ;
    }
}
