public interface palindrome {
    public static void main(String[] args) {
        int no=48734 , rem , rev=0 , t;
        t = no;
        while(no>0){
            rem = no % 10;
            rev = rev * 10 + rem;
            no = no/10;

    }
    System.out.println("reverse of num is : "+rev);
    if (t==rev){
        System.out.println("it is palindrome");
    
    }
    else{
        System.out.println("it is not palindrome");
    }
}
}