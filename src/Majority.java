public class Majority {
    public static void main(String[] args){
        int array[] = {2,2,1,1,1,1,1,2,2};
        int intial_count = 0;
        int majority_element = 0;
        for(int i = 0;i < array.length;i++){
            int count = 0;
            for (int j = 0; j < array.length; j++){
                if (array[i] == array[j]){
                    count++;
                }
            }
            if (count > intial_count){
                intial_count = count;
                majority_element = array[i];
            }
            if (count > ((array.length) - 1) / 2){
                break;
            }
        }
        System.out.println(majority_element);
    }
}
