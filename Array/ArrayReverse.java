package Array;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] reverse=new int[arr.length];
        
            for(int i=arr.length-1,j=0;i>=0;i--,j++){
                reverse[j]=arr[i];
             }
        
        System.out.println("Original Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nReversed Array: ");
        for(int i=0;i<reverse.length;i++){
            System.out.print(reverse[i]+" ");
        }
        System.out.println("\nReversed Array with alternate elements: ");{
            for(int i=0;i<reverse.length;i=i+2){
                System.out.print(reverse[i]+" ");
            }
        }
        sc.close();
    }
}
