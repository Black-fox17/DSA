import java.util.Arrays;
public class removeElement{
    public static void main(String [] args){
        int[] nums = {3,2,2,3};
        int val = 3;
        // Expected output = [0,1,4,0,3,_,_,_]
        // Expected LEngth = 5
        int [] expectedNums = new int[nums.length];
        int k = 0;
        for (int x: nums){
            if (x != val){
                expectedNums[k] = x;
                k += 1;
            }
        }
        nums = expectedNums;
        sort(nums,0,k);
        System.out.println((Arrays.toString(nums)));
    }
    private static void sort(int[] arrays,int left,int right){
        for (int i = 0; i < arrays.length;i ++){
            boolean flag = false;
            for(int k = left;k < (right - 1);k ++){
                if (arrays[k] > arrays[k + 1]){
                    int temp = arrays[k];
                    arrays[k] = arrays[k + 1];
                    arrays[k + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false){
                break;
            }
        }
    }
}