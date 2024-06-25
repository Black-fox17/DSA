public class new_gcd {
    public static void main(String [] args){
        int test_array[] = {410193,229980,600441};
        int array_length = test_array.length;
        System.out.println(check_even(test_array));
        if (check_even(test_array).equals("even")){
            System.out.println(-1);
        }else{
            for (int i = array_length - 2; i > -2; i--){
                if (i == -1){
                    int first_num = test_array[0];
                    int second_num = test_array[array_length - 1];
                    int result = gcd(first_num,second_num);
                    test_array[array_length - 1] = result;
                }else{
                    int first_num = test_array[i];
                    int second_num = test_array[i + 1];
                    first_num = gcd(first_num,second_num);
                    test_array[i] = first_num;
                }
            }
            for (int x: test_array){
                System.out.println(x);
            }
        }
     }
    public static String check_even(int[] array){
        for (int x: array){
            if (x % 2 != 0){
                return "odd";
            }
        }
        return "even";
    }
    public static int gcd(int a , int b){
        int new_a;
        int new_b;
        int result;
        if (a > b){
            new_a = a;
            new_b = b;
        }else{
            new_b = a;
            new_a = b;
        }
        if (a == 0){
            result = b;
            return result;
        }else if(b == 0){
            result = a;
            return result;
        }
        int remainder = new_a % new_b;
        return gcd(new_b,remainder);

    }
}
