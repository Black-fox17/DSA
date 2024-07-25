import java.util.Arrays;
public class duplicate{
    public static void main(String[] args){
        int test[] = {0,0,1,1,1,2,2,3,3,4};
        int count = 1;
        int i = 0;
        boolean test_value = false;
        int intial = test[0];
        while (i < test.length && test_value == false){
            if(intial != test[i]){
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