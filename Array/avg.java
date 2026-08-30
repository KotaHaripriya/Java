package Array;

import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int len = sc.nextInt();
        int[] arr= new int[len];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Elements of array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }        
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int avg = sum/len;
        System.out.println("\nAvg of elements: "+avg);
        sc.close();

    }
}
