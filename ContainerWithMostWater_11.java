public class ContainerWithMostWater_11 {
    static int bruteforce(int[] a){
        if(a.length<=2) return Math.min(a[0],a[1]);
        int i=0,j=a.length-1;
        int maxArea=0;
        while(i<j){
            int width=j-i;
            int cArea=width*Math.min(a[i],a[j]);
            maxArea=Math.max(cArea,maxArea);
            if(a[i]<a[j]) i++;
            else j--; 
        }
        return maxArea;
    }
    static int optimized(int[] a){
        if(a.length<=2) return Math.min(a[0],a[1]);
        int i=0,j=a.length-1;
        int maxArea=0;
        while(i<j){
            int h=Math.min(a[i],a[j]);
            int cArea=(j-i)*h;
            maxArea=Math.max(maxArea,cArea);

            while(i<j && a[i]<=h) i++;
            while(i<j && a[j]<=h) j--;

        }
        return maxArea;


    }
    public static void main(String[] args) {
        int[] a={1,1};
        int result=bruteforce(a);
        System.out.println(result);
    }
}
