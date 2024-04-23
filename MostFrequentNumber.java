import java.util.HashMap;

public class MostFrequentNumber {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer> temp = new HashMap<>();

        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==key){
                if(temp.containsKey(nums[i])){
                    temp.put(nums[i], temp.get(nums[i])+1);
                }else{
                    temp.put(nums[i],1);
                }
            }
        }
        int out = 0;
        int count = Integer.MIN_VALUE;
        for(int a: temp.keySet()){
            if(count < temp.get(a)){
                count = temp.get(a);
                out = a;
            }
        }
        return out;
    }
}
