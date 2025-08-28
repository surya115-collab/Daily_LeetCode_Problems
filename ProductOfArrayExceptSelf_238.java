
import java.util.Arrays;

public class ProductOfArrayExceptSelf_238{

    public static int[] productArray(int[] a){
        int n=a.length;
        int[] result=new int[n];
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i]=result[i-1]*a[i-1];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            result[i]=result[i]*suffix;
            suffix*=a[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};

        int[] result=productArray(arr);

        System.out.println(Arrays.toString(result));
    }
    
}
