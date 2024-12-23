public class test{
    public static void main(String[] args){
        System.out.println("Hello world");
        /*gcd for 540 and 168 is 12 */
        int result = gcd(540,168);
        int result_2 = factorial(6);
        int result_3 = fibonacci(6);
        System.out.println(result);
        System.out.println(result_2);
        System.out.println(result_3);
        int length = 10;
        // for(int i = 1;i < 10;i++){
        //     int space = length / 2;
        //     System.out.println(" ".repeat(space)+"*".repeat(i));
        //     length -= 1;
        // }

    }
    protected static int fibonacci(int x){
        if (x == 0){
            return 0;
        }
        return fibonacci(x, 1, 0);
    }
    protected static int fibonacci(int x, int track,int i){
        if (x == 1){
            return track;
        }
        //System.out.println(track);
        return fibonacci(x - 1,track + i,track);
    }
    protected static int factorial(int x){
        return factorial(x,1);
    }
    protected static int factorial(int x, int track){
        if (x == 1){
            return track;
        }
        track *= x;
        return factorial(x - 1, track);

    }
    protected static int gcd(int x, int y){
        int rem;
        if (y == 0){
            return x;
        }
        int new_x;int new_y;
        if(x < y){
            new_x = y;new_y = x;
        }else{
            new_x = x;new_y = y;
        }
        rem = new_y;new_y = new_x % new_y;
        return gcd(rem,new_y);
    }
}