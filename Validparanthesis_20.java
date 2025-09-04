
import java.util.HashMap;
import java.util.Stack;

public class Validparanthesis_20 {
    static boolean isValid(String s){
        char[] ch=s.toCharArray();
        HashMap<Character,Character> map=new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        Stack<Character> st=new Stack<>();
        for(char c:ch){
            if(map.containsKey(c)){
                char top=st.isEmpty()?'#':st.pop();

                if(top!=map.get(c)){
                    return false;
                }
            }
            else{
                st.push(c);
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s="{[(]}";
        Boolean result=isValid(s);
        System.out.println(result);
    }
}
