public class Binary {
    public static void main(String[] args){
        int x = 12;
        String k = "";
        for (int i= 1; i < x + 1; i++){
            String result = c_bir(i);
            k += result;
        }
        int answer =  (int)(decimal("1101110010111011110001001101010111100") % 1000000007l);
        System.out.println(answer);
    }
    public static long decimal(String value){
        int length = value.length();
        long sum = 0;
        for (int i = 0; i < value.length();i++){
            sum += Character.getNumericValue(value.charAt(i)) * Math.pow(2,length - 1);
            length -= 1;
        }
        return sum;
    }
        public static String c_bir(int x){
        String h = "";
        while(x > 0){
            int rem = x % 2;
            h = rem + h;
            x /= 2;
        }
        return h;
    }
}
