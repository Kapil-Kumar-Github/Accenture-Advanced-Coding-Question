public class FindPeakElement {
    static int peakElement(int [] arr){
        int peak = Integer.MIN_VALUE ;
        int index=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                peak=Math.max(peak, arr[i]) ;
                if(peak==arr[i]){
                    index=i ;
                }

            }
        }
        return index ;
    }
    public static void main(String [] args){
          int [] nums = {1,2,3,1} ;
          System.out.println(peakElement(nums)) ;
    }
}
