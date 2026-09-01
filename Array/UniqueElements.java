package Array;

public class UniqueElements {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,10,20,70};
        System.out.println("Original array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nUnique elements of array: ");
        
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){         
                   if(arr[i]==arr[j]){
                    count++;
                       break;
                       
                    }
                    if(count==0){
                        System.out.print(arr[i]+" ");
                        break;
                    }
                   
            }
    }
}
}
