import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement_I_496{
    static int[] optimized(int[] n1,int[] n2){
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();

        for(int num:n2){
            while(!stack.isEmpty() && stack.peek()<num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }

        int[] res=new int[n1.length];
        for(int i=0;i<n1.length;i++){
            res[i]=map.getOrDefault(n1[i], -1);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] n1={4,1,2};
        int[] n2={1,3,4,2};

        System.out.println(Arrays.toString(optimized(n1,n2)));

    }
}