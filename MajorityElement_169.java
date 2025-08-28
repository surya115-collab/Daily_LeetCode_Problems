
import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169{
    public static int majority(int[] a){
        int max=0,majority=0;
        Map<Integer,Integer> mp=new HashMap<>();

        for(int num:a){
            mp.put(num,mp.getOrDefault(num, 0)+1);
            if(mp.get(num)>max){
                max=mp.get(num);
                majority=num;
            }
        }

        return majority;
    }
    public static void main(String[] args) {
        int[] a={2,2,2,2,1,1,1,1,3,3,3,3,3,3,3,3,3};

        int result=majority(a);

        System.out.println(result);
    }
}