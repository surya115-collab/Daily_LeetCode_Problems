import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1{
    public static int[] returninfIndices(int[] arr,int target){
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(hm.containsKey(diff)){
                return new int[]{hm.get(diff),i};
            }
            hm.put(arr[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr={2,3,3,4,5,6,4,5,6,};
        int target=10;

        int[] result=returninfIndices(arr, target);

        System.out.println(Arrays.toString(result));
    }
}