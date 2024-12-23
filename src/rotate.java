import java.util.Arrays;
public class rotate{
    public static void main(String[] args){
        int array[] = {-1,-100,3,99};
        int k = 2;
        int c = array.length;
        while (k > 0){
            int length = c;
            for(int i = (array.length) - 2;i >= 0; i--){
                int temp = array[length - 1];
                array[length - 1] = array[i];
                array[i] = temp;
                length--;
                //System.out.println(Arrays.toString(array));
            }
            k--;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void rotate_n(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}