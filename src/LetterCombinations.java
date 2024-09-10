import java.util.List ;
import java.util.ArrayList ;

public class LetterCombinations {

    static List<String> def(String s){

        String [] mobileNumChar = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"} ;
        int l1 = Integer.valueOf(String.valueOf(s.charAt(0))) ;
        int l2 = Integer.valueOf(String.valueOf(s.charAt(1))) ;

        String s1 = mobileNumChar[l1] ;
        String s2 = mobileNumChar[l2] ;

        List<String> combination = new ArrayList<>() ;
//        combination.add("a") ;
//        combination.add("b");

        for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i) ;
            for(int j=0;j<s2.length();j++){
                char c2 = s2.charAt(j) ;
                //  System.out.println(c1+ " " + c2) ;
                String adding = String.valueOf(c1)+String.valueOf(c2) ;
                combination.add(adding) ;

            }
        }


        return combination;

    }
    public static void main(String [] args){
        String s= "23" ;
        System.out.println(def(s)) ;

    }
}
