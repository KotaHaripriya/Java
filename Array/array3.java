package Array;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("elements of array are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
}
