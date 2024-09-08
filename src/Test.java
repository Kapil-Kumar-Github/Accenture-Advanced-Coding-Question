import java.util.Arrays;
public class Test {



        public static int findCount(int[] arr, int length, int num, int diff) {
            Arrays.sort(arr); // Sort the array for efficient searching

            int left = 0;
            int right = length - 1;
            int count = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (Math.abs(arr[mid] - num) <= diff) {
                    count++;
                    left = mid + 1;
                    right = mid - 1; // Check both sides
                } else if (arr[mid] < num - diff) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return count > 0 ? count : -1;
        }

        public static void main(String[] args) {
            int[] arr = {12, 3, 14, 56, 77, 13};
            int num = 13;
            int diff = 2;

            int count = findCount(arr, arr.length, num, diff);
            System.out.println("Count: " + count);
        }

}
