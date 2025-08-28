public class MaximumSubArray_53{
    public static void maxSubWithoutTwoMaxComparison(int[] a){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
    }

    public static void maxSub(int[] a){
        int maxSum=a[0];
        int cur=a[0];
            for(int i=1;i<a.length;i++){
                cur=Math.max(a[i],cur+a[i]);
                maxSum=Math.max(cur,maxSum);
            }
        System.out.println(maxSum);
    }
    public static void main(String[] args){
        int[] nums = {5,4,-1,7,8};
        maxSubWithoutTwoMaxComparison(nums);
    }
}