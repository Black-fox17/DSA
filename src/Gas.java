public class Gas {
    public static void main(String[] args){
        int[] gas = {5, 8, 2, 8};
        int[] cost = {6, 5, 6, 6};
        int i = 0;
        int k = 0;
        int total_gas_price = 0;
        while (i < gas.length){
            if(k == i){
                System.out.println("For station " + i);
                total_gas_price += gas[i];
                System.out.println(total_gas_price - cost[(k) % gas.length]);
                k += 1;
            }
            if((k == i + 1) &&( (total_gas_price - cost[(k - 1) % gas.length]) <= -1)){
                System.out.println((total_gas_price - cost[(k) % gas.length]));
                total_gas_price = 0;
                i += 1;
                k = i;
                //System.out.println(i);
                continue;
            }
            if (k > i){
                total_gas_price = total_gas_price - cost[(k - 1) % gas.length] + gas[k % gas.length];
                System.out.println(total_gas_price + " and " + (total_gas_price - cost[(k) % gas.length]));
                k += 1;
            }
            if((total_gas_price - cost[(k - 1) % gas.length]) <= -1){
                System.out.println((total_gas_price - cost[(k) % gas.length]));
                total_gas_price = 0;
                i += 1;
                k = i;
                //System.out.println(i);
                continue;
            }
            if(k == (i + gas.length)){
                System.out.println(total_gas_price);  
                if((total_gas_price - cost[(k) % gas.length]) + gas[i] - total_gas_price >= 0){
                    System.out.println("The right station is " + i);
                    break;
                }else {
                    total_gas_price = 0;
                    i += 1;
                    k = i;
                }
            }
            if ((i == gas.length) || (gas.length != cost.length)){
                System.out.println("The right station is " + -1);
            }
            //System.out.println(i);
        }
    }
}
