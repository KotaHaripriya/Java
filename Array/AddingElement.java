package Array;

import java.util.Scanner;

public class AddingElement {
    //adding element at specific position
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter position where you want add element: ");
            int id=sc.nextInt();
            System.out.println("Enter element: ");
            int value=sc.nextInt();
            System.out.println("Do you want to contiune y/n: ");
            char ch = sc.next().charAt(0);
            arr[id]=value;
            if (ch=='n') {
                break;          
            }
            

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
        

    }
    

}
