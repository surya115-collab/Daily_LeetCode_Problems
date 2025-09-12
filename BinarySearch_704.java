public class BinarySearch_704 {

    static int binarySearch(int[] a,int t){
        int len=a.length;
        int start=0,end=len-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==t)
                return mid;
            else if(a[mid]<t)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={-1,0,3,5,9,12};
        int target=9;
        System.out.println(binarySearch(a, target)==-1?"element not found":"element "+binarySearch(a, target));
    }
}
