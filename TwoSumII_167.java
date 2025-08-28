

import java.util.Arrays;

public class TwoSumII_167 {
    static int[] twoSumSorted(int[] a,int target){
        int l=0,r=a.length-1;
        while(l<r){
            int sum=a[l]+a[r];
            if(sum==target)
                return new int[] {l+1,r+1};
            else if(sum<target)
                l++;
            else
                r--;
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,7};
        int target=9;
        int[] result=twoSumSorted(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
