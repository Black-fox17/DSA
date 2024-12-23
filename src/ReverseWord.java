import java.util.ArrayList;
public class ReverseWord{
    public static void main(String[] args){
        ArrayList<String> empty = new ArrayList<>();
        String test = "      the sky    is blue         ";
        test = test.trim();
        String hold = "";
        int length = 0;
        //int count = 1;
        for(char c: test.toCharArray()){
            if ((c == ' ') && (hold == "")){
                hold = "";
            }
            if (c != ' '){
                hold += c;
            }
            if ((c == ' ') && (hold != "")){
                empty.add(hold);
                hold = "";
            }
            if (length == test.length() - 1){
                empty.add(hold);
            }
            length += 1;
        }
        String reverstring = "";
        int count = 0;
        int new_length = empty.size();
        for (int i = (new_length - 1); i >= 0; i--){
            reverstring += empty.get(i);
            reverstring +=" ";
        }
        System.out.println(reverstring);
    }
}