import java.util.Arrays;
public class merge_sorted{
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        int large_int;
        int total_element;
        if(m > n){
            large_int = m;
        }else{
            large_int = n;
        }
        if (m == 0 && n != 0){
            total_element = n;
        }else if (m != 0 && n == 0){
            total_element = m;
        }else{
            total_element = m + n;
        }
        int [] new_array = new int[total_element];
        int j = 0;
        int y = 0;
        for(int i = 0; i < large_int; i++){
            System.out.println(Arrays.toString(new_array));
            int first_num;
            int second_num;
            int elem;
            if (i < m){
                first_num = nums1[i];
            }else{
                first_num = 0;
            }
            if (i < n){
                second_num = nums2[i];
            }else{
                second_num = 0;
            }
            if (first_num== 0 && second_num == 0){
                break;
            }else if (second_num == 0 && first_num != 0){
                elem = first_num;
                new_array[j] = elem;
                j += 1;
                y += 1;
            }else if (first_num == 0 && second_num != 0){
                elem = second_num;
                new_array[j] = elem;
                j += 1;
                y +=1;
            }else{
                if (first_num> second_num){
                    new_array[j] = second_num;
                    new_array[j + 1] = first_num;
                }else{
                    new_array[j] = first_num;
                    new_array[j + 1] = second_num;
                }
                j += 2;
            }
        }
        nums1 = new_array;
        System.out.println(Arrays.toString(nums1));
    }
}