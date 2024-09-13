import java.util.List ;
import java.util.Arrays ;
import java.util.ArrayList ;
import java.util.HashMap ;
import java.util.Map ;
public class groupAnagram {
    static boolean checkAnagram(String s1, String s2){
        if(s1.length()!=s2.length()) {
            return false ;
        }
        char [] char1 = s1.toCharArray() ;
        char [] char2 = s2.toCharArray() ;
        Arrays.sort(char1) ;
        Arrays.sort(char2) ;

        return Arrays.equals(char1,char2) ;
    }
    static List<List<String>> groupAnagram(String []str){
        Map<String , List<String>> hashMap = new HashMap<>() ;

        for(String s : str){
            char [] charArray= s.toCharArray() ;
            Arrays.sort(charArray) ;

            String sortedString = new String(charArray) ;

            if(!hashMap.containsKey(sortedString)){
                hashMap.put(sortedString ,new ArrayList<>()) ;
            }
            hashMap.get(sortedString ).add(s) ;

        }

        return new ArrayList<>(hashMap.values()) ;
    }
    
    public static void main(String [] args){
        //List<String> list = new ArrayList<>() ;
        String[] arr = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> list = groupAnagram(arr) ;
        System.out.println(list) ;




    }
}
