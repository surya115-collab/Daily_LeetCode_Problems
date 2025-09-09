
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15{
    static List<List<Integer>> triplets(int[] a){
        Arrays.sort(a); //sorts the array
        List<List<Integer>> result=new ArrayList<>();//to store the triplets we found
        int n=a.length;
        //it is the outer loop for one element
        for(int i=0;i<n-2;i++){ //we loop until the last thhird element>Because,we need atleast 3 elements to form triplets
            
            if(i>0 && a[i]==a[i-1]) continue; //if the current element is same as previous element we skip it to remmove duplicates
            
            int j=i+1,k=n-1;//we are using 2 pointers after outer loop,overlapping pointers for two elements that matches with the another element in the outer loop

            
            while(j<k){
                int sum=a[i]+a[j]+a[k];
                if(sum==0){
                    result.add(Arrays.asList(a[i],a[j],a[k]));//if sum=0 then we store the triplets
                    j++;
                    k--;
                    while(j<k && a[j]==a[j-1]) j++; //we skip if the element is same as previous one to remove duplicates

                    while(j<k && a[k]==a[k+1]) k--; //we skip if the element is same as previous one to remove duplicates
                }
                else if(sum<0){ //if the sum is <0 the array is sorted so we move the left element inside to increase the value of the sum
                    j++;
                }
                else if(sum>0){ //if the sum is >0 the array is sorted so we move the right element inside to decrease the value of the sum
                    k--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        List<List<Integer>> ans=triplets(arr);
        System.out.println(ans);
        
    }
    
}
