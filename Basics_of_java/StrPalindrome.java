public class StrPalindrome {
    public static void main(String[] args) {
        String s = "dad";
        String r= "";
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        System.out.println(r);
        if(s.equals(r)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}
