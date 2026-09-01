package Array;

public class NegativeElements {
    // WAP to print all negative elements in an array and also count total number of
    // negative elements in an array.
    public static void main(String[] args) {
        int[] arr={12,34,-11,-56,-90,22,13};
        int count=0;
        System.out.println("Negative elements of array: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.println("\n No of negative elements: "+count);
    }
}
