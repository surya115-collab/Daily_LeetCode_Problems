
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_3{
    static int substring(String s){
        int i=0,j=0,max=0;
        Set<Character> set=new HashSet<>();
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                max=Math.max(max,set.size());
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s="abcabca";
        int result=substring(s);
        System.out.println(result);
    }
}
