package Array;

public class DuplicateElements {
    //WAP to find and count total number of duplicate elements in an array.
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,10,20,70};
        System.out.println("Original array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nDuplicate elements of array: ");
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                {
                    if(arr[i]==arr[j]){
                        System.out.print(arr[i]+" ");
                        count++;
                        break;

                    }
                }
               
            }
        }
        System.out.println("\nTotal no of duplicate elemnets: "+count);
    }
}
