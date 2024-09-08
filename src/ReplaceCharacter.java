public class ReplaceCharacter {
    static String replace(String str, int n ,char ch1 , char ch2){
        str.toLowerCase() ;
        StringBuilder ss = new StringBuilder(str) ;

        for(int i=0;i<n;i++){
            if(str.charAt(i)==ch1){
                ss.setCharAt(i,ch2) ;
            }
            else if(str.charAt(i)==ch2){
                ss.setCharAt(i,ch1) ;
            }

        }
        return ss.toString() ;

    }
    public static void main(String [] args){
        String s= "apples" ;
        System.out.println(replace(s,s.length(),'a','p')) ;
    }
}
