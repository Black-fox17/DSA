import java.util.ArrayList;
public class gcd {
    public static void main(String[] args){
        int array[] = {2,6,3,4};
        int result[] = new int[array.length];
        int k = array.length;
        boolean test = false;
        ArrayList<Double> div_a;
        ArrayList<Double> div_b;
        ArrayList<Double> common_div;
            for (int i = k - 2; i > 0;i--){
                div_a = new ArrayList<>();
                div_b = new ArrayList<>();
                common_div = new ArrayList<>();
                int t_1 = 1;
                int t_2 = 1;
                int first_num = array[i];
                int second_num = array[i + 1];
                while(t_1 != first_num && t_2 != second_num){
                    double div;
                    double div_2;
                    if (first_num % i == 0 && t_1 != first_num){
                        div = t_1;
                        div_a.add(div);
                    }
                    t_1 += 1;
                    if (second_num % i == 0 && t_2 != second_num){
                        div_2 = t_2;
                        div_b.add(div_2);
                    }
                    t_2 += 1;
                }
                int shape;
                if (div_a.size() < div_b.size()){
                    shape = div_a.size();
                }else{
                    shape = div_b.size();
                }

                for (int f = 0; f < shape; f++){
                    double value = div_a.get(f);
                    if (value == div_b.get(f)){
                        common_div.add(value);
                    }

                }
                System.out.println(common_div);
            }
    }
}
