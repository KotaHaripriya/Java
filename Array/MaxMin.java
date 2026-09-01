package Array;


public class MaxMin {
    public static void main(String[] args) {
        int[] array={12,13,14,90,16,17};
        int max=0;
        int min=0;
        System.out.println("Original array: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        max=array[0];
        min=array[0];
        for(int i=1;i<array.length;i++){
             
            if(max<array[i]){
                max=array[i];
            }
            if(min>array[i]){
                min=array[i];
            }
            
        }
        System.out.println("\nMax element : "+max);
        System.out.println("\nMin element: "+min);
        


    }
}
