public class Start {
    public static void main(String[] args){
        String x = "Hello World";
        int k = 0;
        int i = 0;
        for(char c: x.toCharArray()){
            if (c == ' '){
                k = 0;
            }else{
                k++;
            }
            i++;
        }
        System.out.println(k);
    }
}
