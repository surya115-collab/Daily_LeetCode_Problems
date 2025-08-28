
import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate_217{
    public static boolean  removeDuplicate(int[] a){
        Set<Integer> set=new HashSet<>();
        for(int i:a){
            if(!set.add(i)){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr={2,2,3,4,5,7,1,9};

        System.out.println(removeDuplicate(arr)?"has duplicate":"no duplicates");
    }
}