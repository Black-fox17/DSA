public class BoatLimit {
    public static void main(String[] args){
        int[] people = {3,5,3,4};
        int limit = 5;
        int count = 0;
        for(int i = 0; i < people.length;i++){
            if(people[i] == 0 || people[i] > limit){
                continue;
            }
            if(people[i] == limit){
                count += 1;
                people[i] = 0;
                continue;
            }
            boolean flag = false;
            for(int j = i + 1; j < people.length;j++){
                if(people[i] + people[j] <= limit){
                    count += 1;
                    people[j] = 0;
                    flag = true;
                    break;
                }
            }
            if(!flag){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
