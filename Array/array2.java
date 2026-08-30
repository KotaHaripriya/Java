package Array;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }
        System.out.println("\n Addition: "+sum);
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);

        sc.close();
    }
    
}
