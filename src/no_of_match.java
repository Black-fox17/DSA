import java.util.Set;
import java.util.HashSet;
public class no_of_match {
    public static void main(String [] args){
        String s = "abcde";
        String[] words = {"a","bb","acd","ace","dra"};
        String test = "jhdjjjjjjjjsjhjsnanabuabufbububub";
        Set<Character> uniquechars = new HashSet<>();
        for (char f: test.toCharArray()){
            uniquechars.add(f);
        }
        System.out.println(uniquechars);
        for (String word: words){
            if (check_instance(s,word)){
                System.out.println(word);
            }
          }  
        }
    private static boolean check_instance(String s, String word){
        int sindex = 0;
        int wordind = 0;
        while (sindex < s.length() && wordind < word.length()){
            if (s.charAt(sindex) == word.charAt(wordind)){
                wordind += 1;
            }
            sindex += 1;
        }
        return (wordind == word.length());
    }
}