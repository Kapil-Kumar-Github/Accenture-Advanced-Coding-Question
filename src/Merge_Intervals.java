import java.util.List ;
import java.util.ArrayList;
import java.util.Collections ;
class Interval{
    int start ;
    int end ;
    Interval(int start , int end){
        this.start=start ;
        this.end=end ;
    }

}
public class Merge_Intervals{
    static List<Interval> def(List<Interval> inter){
        Collections.sort(inter, (i1,i2) -> i1.start-i2.start) ;

        List<Interval> merge = new ArrayList<>() ;

        for(Interval i : inter){
            if(merge.isEmpty() || merge.get(merge.size()-1).end <i.start){
                merge.add(i) ;
            }
            else{
                merge.get(merge.size()-1).end = Math.max(merge.get(merge.size()-1).end , i.end) ;
            }
        }


        return merge ;


    }
    public static void main(String [] args){
        List<Interval> interval = new ArrayList<>() ;
        interval.add(new Interval(1,3)) ;
        interval.add(new Interval(2,6)) ;
        interval.add(new Interval(8,10)) ;
        interval.add(new Interval(15,18)) ;

        System.out.println("Initial Interval List be ") ;

        for(Interval z : interval){
            System.out.print("["+z.start+","+z.end+"]") ;
        }

        List<Interval> getted = def(interval) ;
        System.out.println() ;
        System.out.println("Merge Interval list be ") ;
        for(Interval z : getted){
            System.out.print("[" + z.start + ","+ z.end + "]") ;
        }


    }
}