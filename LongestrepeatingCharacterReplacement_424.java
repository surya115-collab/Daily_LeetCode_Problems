
import java.util.HashMap;

public interface LongestrepeatingCharacterReplacement_424 {
    static int longestChar(String s,int k){
        int i=0,maxLength=0,maxFreq=0,window=0;

        HashMap<Character,Integer> map=new HashMap<>();

        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);
            maxFreq=Math.max(maxFreq,map.get(c));

            window=j-i+1;

            if(window-maxFreq>k){
                char leftChar=s.charAt(i);
                map.put(leftChar,map.get(leftChar)-1);
                i++;

                window=j-i+1;
            }
            maxLength=Math.max(maxLength,window);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s="AABABBA";
        int k=1;
        int result=longestChar(s,k);
        System.out.println(result);
    }
}
