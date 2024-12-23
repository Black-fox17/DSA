import java.util.Arrays;
public class ProductArray{
    public static void main(String[] args){
        int test_variables[] = {1,2,3,4};
        // Expected result = [24,12,8,6]
        int result[] = new int[test_variables.length];
        int i = 0;
        int k = 0;
        int result_num = 1;
        boolean test_value = false;
        while(test_value == false){
            if (i != k){
                result_num *= test_variables[k];
            }
            k += 1;
            if (k == test_variables.length){
                result[i] = result_num;
                k = 0;
                i += 1;
                result_num = 1;
            }
            if (i == test_variables.length - 1){
                test_value = true;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}