public class type_casting {
    public static void main(String[] args) {
        int a = 45667;
        //Explicit_type_casting : narrowing the data : may loss some data
        byte b = (byte)a;
        char c = (char)a;
        System.out.println(a+" , "+b+ " , "+c);

        //implicit : Widning of data

        float f = a;
        long l = a;
        double d = a;

        System.out.println(f+" , "+l+" , "+d);
    }
}
