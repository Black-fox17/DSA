import java.util.Arrays;
public class TesxtJ {
    public static void main(String[] args){
        String[] words = {
            "This", "is", "an", "example", "of", "text", "justification."
        };
        int maxwidth = 16;
        int length = 0;
        String sentence = "";
        int count = 1;
        for(String x:words){
            length += x.length();
            if (length > maxwidth){
                sentence += ",";
                count += 1;
                length = 0;
                length += x.length();
            }
            if (length <= maxwidth){
                sentence += x;
                length += 1;
                sentence += " ";
            }
        }
        sentence+= ',';
        String[] new_words = new String[count];
        int[] length_words = new int[count];
        int[] length_spaces = new int[count];
        int i = 0;
        int length_count = 0;
        int space_count = 0;
        String u = "";
        for (char g:sentence.toCharArray()){
            if (g == ','){
                new_words[i] = u;
                length_words[i] = length_count;
                length_spaces[i] = space_count;
                i+= 1;
                length_count = 0;
                space_count = 0;
                u = "";
            }
            if (g != ','){
                if (g == ' '){
                    space_count += 1;
                }else{
                    length_count += 1;
                }
                u += g;

            }
        }

        for (int g = 0; g < count; g++){
            int major = 1;
            int space = 1;
            int sub_length = 16 - length_words[g];
            if (sub_length % 2 == 0){
                if (sub_length != 2 ){
                    major = (16 - length_words[g]) / 2;
                }else{
                    major = sub_length;
                }
            }else{
                space = sub_length / 2;

            }
            int space_new_count = 0;
            int arb_count = 0;
            String new_word = "";
            for(char f: new_words[g].toCharArray()){
                if(sub_length % 2 == 0){
                    if (f != ' '){
                        new_word += f;
                        arb_count+= 1;
                    }
                    if (f == ' '){
                        String arb_f = "";
                        arb_f += f;
                        new_word += arb_f.repeat(major);
                        arb_count += major;
                        
                    }
                }else{
                    if(f != ' '){
                        new_word += f;
                        arb_count+= 1;
                    }
                    if (f == ' '){
                        space_new_count += 1;
                        if(g == (count - 1)){
                            if (space_new_count == length_spaces[g]){
                                int rem = 16 - arb_count;
                                String arb_f = "";
                                arb_f += f;
                                new_word += arb_f.repeat(rem);
                                arb_count += rem;
                            }
                        // }else{
                        //     if(new_words[g].charAt(length_words[g] - 1) == ' '){

                        //     }
                        // }
                        // if (space_new_count == 1){
                        //     int rem = 16 - arb_count;
                        //     String arb_f = "";
                        //     arb_f += f;
                        //     new_word += arb_f.repeat(rem);
                        //     arb_count += rem;
                        }
                        else{
                            String arb_f = "";
                            arb_f += f;
                            new_word += arb_f.repeat(space);
                            arb_count += space;
                        }
                    }
                }
                if (arb_count == 16){
                    
                    new_words[g] = new_word;
                    break;
                }
            }
            //System.out.println(arb_count);
        }
        System.out.println(Arrays.toString(length_words));
        System.out.println(Arrays.toString(length_spaces));
        System.out.println(Arrays.toString(new_words));
    }
    // protected int[] check_lengths(){
        
    // }
}
