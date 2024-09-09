public class LongestSubstringWithoutRepetition {
    static boolean checkUniqueCharacterSubstring(String s , char c){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                return false ;
            }
        }
        return true ;
    }   
    static int longestSubstringWithoutRepetition(String str){

        int len = str.length() ;
        String subString = "" ;
        int maxLength = Integer.MIN_VALUE ;

        for(int i=0;i<len;i++){
            subString = String.valueOf(str.charAt(i)) ;
            for(int j=i+1 ; j<len;j++){
                if(checkUniqueCharacterSubstring(subString,str.charAt(j))==true){
                    subString+=String.valueOf(str.charAt(j)) ;

                }

            }
            maxLength = Math.max(maxLength, subString.length()) ;

        }
        return maxLength ;
    }
    public static void main(String [] args){
        String s = "abcabcbb" ;
        System.out.println(longestSubstringWithoutRepetition(s) );

    }
}
