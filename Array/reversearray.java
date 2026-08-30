package Array;

import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        int[] arr =new int [5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int arr1[]=new int[arr.length];
        for(int i=arr.length-1,j=0;i>=0;i--,j++){
            arr1[j]=arr[i];
        }
        for(int n:arr1)
            System.out.println(n+" ");
        sc.close();
    }
}
