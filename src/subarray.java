import java.util.Arrays;

public class subarray{
    public static void main(String[] args){
        int array[] = {1,2,3,4,5,6}; 
        int target = 6;
        boolean value = false;
        for(int i = 0; i < array.length;i++){
            int sum = 0;
            int count = 0;
            String result = "";
            for(int k = i; k < array.length;k++){
                sum += array[k];
                result += array[k];
                count += 1;
                if(sum == target){
                    //System.out.println(result.charAt(1));
                    value = true;
                    char subarray[] = new char[count];
                    for(int g = 0;g < count;g++){
                        System.out.println(g);
                        subarray[g] = result.charAt(g);
                    }
                    System.out.println(Arrays.toString(subarray));
                    //break;
                }
            }
            // if (value == true){
            //     break;
            // }
        }
        //System.out.println(Arrays.toString(subarray));
    }
}