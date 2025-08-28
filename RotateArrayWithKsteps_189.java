public class RotateArrayWithKsteps_189{
    static void reverse(int[] a,int left,int right){
        while(left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            right--;
            left++;
        }
    }
    public static void main(String[] args) {
        int[] a={3,4,5,6,7,0};
        int k=3,n=a.length;

        reverse(a, 0, n-1);
        reverse(a, 0, k-1);
        reverse(a,k,n-1);

        for(int i:a){
            System.out.print(i+" ");
        }

    }
}