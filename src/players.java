public class players{
    public static void main(String[] args){
        int [] skills = {2,5,4};
        //int[] players = {0,1,2,3,4};
        int k = 2;
        int k_count = 0;
        int player = 0;
        int first_skill = skills[player];
        boolean test = true;
        while (test){
            for (int i = 1; i < skills.length;i++){
                if (first_skill < skills[i]){
                    first_skill = skills[i];
                    player = i;
                    k_count = 0;
                }
                k_count += 1;
                if (k_count == k){
                    System.out.println("" + player);
                    test = false;
                    break;
                }
            }
        }
    }
}