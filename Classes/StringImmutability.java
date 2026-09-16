package Classes;

public class StringImmutability {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Java";

        if(s1==s2){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }

        String str1=new String("Java");
        String str2=new String("Java");
        if(str1.equals(str2)){
            System.out.println("Strings are equal");
        
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
