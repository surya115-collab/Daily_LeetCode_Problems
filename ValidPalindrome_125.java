public class ValidPalindrome_125 {
    static boolean isPalindome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            char l=s.charAt(i);
            char r=s.charAt(j);

            if(!Character.isLetterOrDigit(l)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(r)){
                j--;
                continue;
            }
            if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s=" ";
        boolean result=isPalindome(s);
        System.out.println(result);
    }
}
