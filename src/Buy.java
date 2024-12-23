public class Buy {
    public static void main(String[] args){
        int[] stocks = {7,1,5,3,6,4};
        int profit = 0;
        for (int i = 0; i < stocks.length;i++){
            for(int j = i + 1 ; j < stocks.length; j++){
                if (j > i){
                    int new_profit = stocks[j] - stocks[i];
                    if (new_profit > profit){
                        profit = new_profit;
                    }
                }
            }
        }
        System.out.println(calc_profit(stocks));
    }
    protected static int calc_profit(int[] arrays){
        int smallest_element = arrays[0];
        int profit = 0;
        int track_profit = profit;
        for (int i = 1; i < arrays.length;i++){
            if (arrays[i] < smallest_element){
                smallest_element = arrays[i];
            }else{
                track_profit = arrays[i] - smallest_element;
                if (track_profit > profit){
                    profit = track_profit;
                }
            }
        }
        return profit;
    }

}
