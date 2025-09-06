
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures_739{
    static int present(int[] a,int i,int j){

        while(j<a.length){
            if(a[j]>a[i]){
                return j-i;
            }
            else{
                j++;
            }
        }
        return 0;
    }
    static ArrayList<Integer> bruteForce(int[] a){
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<a.length;i++){
            int j=i+1;
            int result=present(a, i, j);
            list.add(result);
        }
        return list;
    }



    static int[] optimized(int[] a){
        int n=a.length;
        Stack<Integer> stack=new Stack<>();
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && a[i]>a[stack.peek()]){
                int prev=stack.pop();
                result[prev]=i-prev;
            }
            stack.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] ar={73,74,75,71,69,72,76,73};
        // System.out.println(bruteForce(ar));

        System.out.println(Arrays.toString(optimized(ar)));

    }
}