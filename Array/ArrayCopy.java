package Array;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = new int[5];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];

        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+" ");
        }

    }
}
