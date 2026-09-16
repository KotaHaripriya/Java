package Classes;

public class ArrayClass {
    public static void main(String[] args) {
        String str="Hello";
        System.out.println("Upper Case: "+str.toUpperCase());
        System.out.println("Lower Case: "+str.toLowerCase());
        if(str.contains("l"))
            System.out.println("'l' is present in "+str);

        String s1=str.concat("Java");
        System.out.println("Original: "+str);
        System.out.println("Concatinated: "+s1);
        System.out.println(str.length());
        System.out.println(str.compareTo("Hello"));
        System.out.println(str.indexOf('o'));
        System.out.println(str.charAt(3));
        System.out.println(str.endsWith("op"));
        str = "Java Programming Language";
        System.out.println(str.substring(10));
        System.out.println(str.substring(5,13));
        String strArray[]=str.split(" ");
        for(String s:strArray)
            System.out.println(s);
        String name[]={"Hari","Rahul","Harsh"};
        String namesstr = String.join("/",name);
        System.out.println(namesstr);




    }
}
