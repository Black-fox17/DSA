import java.sql.Array;
import java.util.Arrays;

public class MidDuplicate {
    public static void main(String[] args){
        int test[] = {0,0,1,1,1,1,2,3,3};
        int count = 1;
        int i = 1;
        boolean test_value = false;
        int intial = test[0];
        int k = 0;
        while (i < test.length){
            if(intial == test[i] && k < 1){
                k += 1;
                test[count] = test[i];
                count += 1;
            }
            if (intial != test[i]){
                k = 0;
                test[count] = test[i];
                count += 1;
            }
            intial = test[i];
            i += 1;
        }
        System.out.println(count);
        System.out.println(Arrays.toString(test));
    }    
}
