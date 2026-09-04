public class intPalindrome {
    public static void main(String[] args) {
        int num=101;
        int rev=0,rem,temp=num;

        while(num>0){
            rem=num%10;
            num=num/10;
            rev=rev*10+rem;

        }
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
