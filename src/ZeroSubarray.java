public class ZeroSubarray {
    public static void main(String[] args){
        int[] test_arr = {1,3,0,0,2,0,0,4};
        int sum = 0;
        int count = 1;
        boolean flag =  true;
        while(flag){
            int temp_sum = 0;
            flag = false;
            for (int j = 0;j < test_arr.length;j++){
                if(test_arr[j] != 0){
                    temp_sum = 0;
                }
                else if(test_arr[j] == 0){
                    temp_sum += 1;
                }
                if (temp_sum == count){
                    sum += 1;
                    flag = true;
                    temp_sum = count - 1;
                }
            }
            count += 1;
        }
        System.out.println(sum);
    }
    public long zeroFilledSubarray(int[] nums) {
        int sum = 0; // Total number of zero subarrays
        int zeroCount = 0; // Current consecutive zero count

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                zeroCount++; // Increment for each consecutive zero
            } else {
                // Add subarrays formed by the consecutive zeros
                sum += (zeroCount * (zeroCount + 1)) / 2;
                zeroCount = 0; // Reset for next sequence
            }
        }

        // Add subarrays from the last sequence of zeros (if any)
        sum += (zeroCount * (zeroCount + 1)) / 2;
        return sum;
    }
}
