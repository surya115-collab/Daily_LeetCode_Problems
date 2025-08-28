public class LongestpalindromiSubstring_5 {
    public static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static String longestSubstring(String s){
        int maxlen=0;
        String maxsubString=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(j-i>maxlen && isPalindrome(s.substring(i,j))){
                    maxlen=j-i;
                    maxsubString=s.substring(i,j);
                }
            }
        }
        return maxsubString;
    }
    public static void main(String[] args) {
        String str="babad";

        String result=longestSubstring(str);

        System.out.println("Longest palinfromic substring is : "+result+"\nLength is : "+result.length());
    }
}
