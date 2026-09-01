package Array;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] even = new int[5];
        int[] odd = new int[5];
        for(int i=0,j=0,k=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even[j]=arr[i];
                j++;
            }
            else{
                odd[k]=arr[i];
                k++;
            }
        }
        System.out.println("Original array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEven elements array: ");
        for(int j=0;j<even.length;j++){
            System.out.print(even[j]+" ");
        }
        System.out.println("\nOdd elements array: ");
        for(int j=0;j<even.length;j++){
            System.out.print(odd[j]+" ");
        }


    }
}
